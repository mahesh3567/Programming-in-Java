
public class Baseclass {
    public static void main(String[] args) {
        Base base = new Base();
        base.area(4, 4);

        Derived derived = new Derived();
        derived.area(4, 5);
    }
}
class Base {
    void area(int a, int b) {
        int squareArea = a * a;
        System.out.println("Area of the square: " + squareArea);
    }
}

class Derived extends Base {
    @Override
    void area(int length, int width) {
        int rectangleArea = length * width;
        System.out.println("Area of the rectangle: " + rectangleArea);
    }
}
