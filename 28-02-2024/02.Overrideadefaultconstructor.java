

public class Overrideadefaultconstructor {
    public static void main(String[] args) {
       
        MyClass obj1 = new MyClass();
        obj1.disp();


        MyClass obj2 = new MyClass(20, 25);
        obj2.disp();
    }
}
class MyClass {
    int a;
    int b;

    // Default constructor
    MyClass() {
        this.a = 10;
        this.b = 15;
    }

    // Parameterized constructor
    MyClass(int a, int b) {
        this.a = a;
        this.b = b;
    }

    void disp() {
        System.out.println("a = " + a + ", b = " + b);
    }
}