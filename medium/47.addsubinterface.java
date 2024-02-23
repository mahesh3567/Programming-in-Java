interface IterF1 {
    double add(double num1, double num2);
    double sub(double num1, double num2);
}

class Calculator implements IterF1 {
    @Override
    public double add(double num1, double num2) {
        return num1 + num2;
    }

    @Override
    public double sub(double num1, double num2) {
        return num1 - num2;
    }
}

public class addsubinterface {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        
        double num1 = 10;
        double num2 = 5;
        
        System.out.println("Addition: " + calc.add(num1, num2));
        System.out.println("Subtraction: " + calc.sub(num1, num2));
    }
}
