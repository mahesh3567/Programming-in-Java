public class Finalkeyword {
    public static void main(String[] args) {
        // Final variable usage
        MyClass obj1 = new MyClass();
        obj1.display();  // Output: num: 10

        // Final method invocation
        Child obj2 = new Child();
        obj2.display();  // Output: Hello from Parent!
        obj2.sayHello(); // Output: Hello from Child!

        // Final class instantiation
        FinalClass obj3 = new FinalClass();
        obj3.display();  // Output: Hello from FinalClass!
    }
}
class MyClass {
    // Final variable
    final int num = 10;

    void display() {
        System.out.println("num: " + num);
    }
}

class Parent {
    // Final method
    final void display() {
        System.out.println("Hello from Parent!");
    }
}

class Child extends Parent {
    // New method in Child class
    void sayHello() {
        System.out.println("Hello from Child!");
    }
}

final class FinalClass {
    void display() {
        System.out.println("Hello from FinalClass!");
    }
}
