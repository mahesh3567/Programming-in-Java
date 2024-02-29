
public class statickeyword {
    public static void main(String[] args) {
        // Static method call
        MyClass.displayMessage();  // Output: Hello from the static method!

        // Static nested class instantiation
        MyClass.StaticNestedClass nestedObj = new MyClass.StaticNestedClass();
        nestedObj.display();  // Output: outerNum from OuterClass: 10

        // Final variable usage
        MyClass obj = new MyClass();
        obj.display();  // Output: num: 10

        // Final class instantiation
        FinalClass finalObj = new FinalClass();
        finalObj.display();  // Output: Hello from FinalClass!
    }
}
class MyClass {
    // Static variable
    static int count = 0;

    // Final variable
    final int num = 10;

    // Static block
    static {
        count = 10;
        System.out.println("Static block executed. count: " + count);
    }

    // Static method
    static void displayMessage() {
        System.out.println("Hello from the static method!");
    }

    // Final method
    final void display() {
        System.out.println("num: " + num);
    }

    // Static nested class
    static class StaticNestedClass {
        void display() {
            System.out.println("outerNum from OuterClass: " + count);
        }
    }
}

final class FinalClass {
    void display() {
        System.out.println("Hello from FinalClass!");
    }
}
