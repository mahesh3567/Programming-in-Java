
// Main class
public class studentdetails {
    public static void main(String[] args) {
        try {
            // Creating a Student object
            Student student1 = new Student(1, "John Doe", 20, "Computer Science");
            System.out.println(student1);

            // Trying to create a Student object with invalid age
            // This should throw AgeNotWithinRangeException
            Student student2 = new Student(2, "Jane Smith", 25, "Mathematics");
        } catch (AgeNotWithinRangeException | NameNotValidException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}
// Custom exception for age not within range
class AgeNotWithinRangeException extends Exception {
    public AgeNotWithinRangeException(String message) {
        super(message);
    }
}

// Custom exception for invalid name
class NameNotValidException extends Exception {
    public NameNotValidException(String message) {
        super(message);
    }
}

// Student class
class Student {
    private int rollNo;
    private String name;
    private int age;
    private String course;

    // Parameterized constructor
    public Student(int rollNo, String name, int age, String course) throws AgeNotWithinRangeException, NameNotValidException {
        if (age < 15 || age > 21) {
            throw new AgeNotWithinRangeException("Age should be between 15 and 21");
        }
        if (!isValidName(name)) {
            throw new NameNotValidException("Name contains numbers or special symbols");
        }

        this.rollNo = rollNo;
        this.name = name;
        this.age = age;
        this.course = course;
    }

    // Check if name is valid (does not contain numbers or special symbols)
    private boolean isValidName(String name) {
        return name.matches("[a-zA-Z]+");
    }

    // Getters and setters
    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    // toString method to display Student details
    @Override
    public String toString() {
        return "Student{" +
                "rollNo=" + rollNo +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", course='" + course + '\'' +
                '}';
    }
}
