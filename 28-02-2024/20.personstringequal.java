public class Person {
    private String name;
    private int age;

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Override toString() method
    @Override
    public String toString() {
        return "Person [name=" + name + ", age=" + age + "]";
    }

    // Override equals() method
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Person person = (Person) obj;
        return age == person.age && name.equals(person.name);
    }

    public static void main(String[] args) {
        // Creating two Person objects
        Person person1 = new Person("John", 25);
        Person person2 = new Person("John", 25);

        // Using toString() method
        System.out.println("person1: " + person1.toString());
        System.out.println("person2: " + person2.toString());

        // Using equals() method
        System.out.println("Are persons equal? " + person1.equals(person2));
    }
}
