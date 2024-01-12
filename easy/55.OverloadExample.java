class Overload {
    void assignValues(int a, int b) {
        System.out.println("Values assigned using a single function with 2 arguments: " + a + ", " + b);
    }

    void assignValues(int a, int b, int c) {
        System.out.println("Values assigned using a single function with 3 arguments: " + a + ", " + b + ", " + c);
    }
}

public class OverloadExample {
    public static void main(String[] args) {
        Overload overloadObj = new Overload();
        overloadObj.assignValues(1, 2);
        overloadObj.assignValues(3, 4, 5);
    }
}
