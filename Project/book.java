import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
import java.util.HashSet;
import java.util.Set;

public class BookManagement {
    private static final String URL = "jdbc:mysql://localhost:3306/book";
    private static final String USER = "root";
    private static final String PASSWORD = "mahesh@890";
    private static final Set<Integer> deletedIds = new HashSet<>();

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }

    public static void getAllBooks() {
        try (Connection connection = getConnection();
             Statement statement = connection.createStatement()) {
            String query = "SELECT id, title, author, price, qty FROM books";
            ResultSet resultSet = statement.executeQuery(query);

            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String title = resultSet.getString("title");
                String author = resultSet.getString("author");
                double price = resultSet.getDouble("price");
                int qty = resultSet.getInt("qty");

                System.out.println("Book ID: " + id);
                System.out.println("Title: " + title);
                System.out.println("Author: " + author);
                System.out.println("Price: Rs." + price);
                System.out.println("Quantity Available: " + qty);
                System.out.println("-----------------------------------");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void addBook() {
        try (Connection connection = getConnection();
             PreparedStatement statement = connection.prepareStatement(
                     "INSERT INTO books (id, title, author, price, qty) VALUES (?, ?, ?, ?, ?)")) {

            int id;
            if (!deletedIds.isEmpty()) {
                id = deletedIds.iterator().next();
                deletedIds.remove(id);
            } else {
                id = generateNewId();
            }

            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter title:");
            String title = scanner.nextLine();
            System.out.println("Enter author:");
            String author = scanner.nextLine();
            System.out.println("Enter price:");
            double price = scanner.nextDouble();
            System.out.println("Enter quantity:");
            int qty = scanner.nextInt();

            statement.setInt(1, id);
            statement.setString(2, title);
            statement.setString(3, author);
            statement.setDouble(4, price);
            statement.setInt(5, qty);

            int rowsInserted = statement.executeUpdate();
            if (rowsInserted > 0) {
                System.out.println("A new book was added successfully!");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void updateBook() {
        try (Connection connection = getConnection()) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter book ID to update:");
            int id = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Select the fields to update (comma separated):");
            System.out.println("1. Title");
            System.out.println("2. Author");
            System.out.println("3. Price");
            System.out.println("4. Quantity");
            String[] fieldsToUpdate = scanner.nextLine().split(",");

            StringBuilder updateQuery = new StringBuilder("UPDATE books SET");
            for (String field : fieldsToUpdate) {
                switch (field.trim()) {
                    case "1":
                        updateQuery.append(" title=?,");
                        break;
                    case "2":
                        updateQuery.append(" author=?,");
                        break;
                    case "3":
                        updateQuery.append(" price=?,");
                        break;
                    case "4":
                        updateQuery.append(" qty=?,");
                        break;
                    default:
                        System.out.println("Invalid field choice: " + field.trim());
                        return;
                }
            }
            updateQuery.deleteCharAt(updateQuery.length() - 1);
            updateQuery.append(" WHERE id=?");

            PreparedStatement statement = connection.prepareStatement(updateQuery.toString());

            int parameterIndex = 1;
            for (String field : fieldsToUpdate) {
                switch (field.trim()) {
                    case "1":
                        System.out.println("Enter new title:");
                        statement.setString(parameterIndex++, scanner.nextLine());
                        break;
                    case "2":
                        System.out.println("Enter new author:");
                        statement.setString(parameterIndex++, scanner.nextLine());
                        break;
                    case "3":
                        System.out.println("Enter new price:");
                        statement.setDouble(parameterIndex++, scanner.nextDouble());
                        break;
                    case "4":
                        System.out.println("Enter new quantity:");
                        statement.setInt(parameterIndex++, scanner.nextInt());
                        break;
                }
            }
            statement.setInt(parameterIndex, id);

            int rowsUpdated = statement.executeUpdate();
            if (rowsUpdated > 0) {
                System.out.println("Book information was updated successfully!");
            } else {
                System.out.println("No book found with the provided ID.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void deleteBook() {
        try (Connection connection = getConnection();
             PreparedStatement statement = connection.prepareStatement(
                     "DELETE FROM books WHERE id=?")) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter book ID to delete:");
            int id = scanner.nextInt();

            statement.setInt(1, id);
            int rowsDeleted = statement.executeUpdate();
            if (rowsDeleted > 0) {
                System.out.println("Book was deleted successfully!");
                deletedIds.add(id);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static int generateNewId() {
        // Implement your logic to generate a new unique ID
        // This is just a placeholder
        return 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. View all books");
            System.out.println("2. Add a book");
            System.out.println("3. Update a book");
            System.out.println("4. Delete a book");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("\nAll Books:");
                    getAllBooks();
                    break;
                case 2:
                    addBook();
                    break;
                case 3:
                    updateBook();
                    break;
                case 4:
                    deleteBook();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 5.");
            }
        }
    }
}
