public class ThisKeywordExamples {
    private int number;
    private String text;

    // Constructor without parameters
    public ThisKeywordExamples() {
        // Default initialization
        this.number = 0;
        this.text = "Default Text";
    }

    // a) Referencing instance variable
    public void setNumber(int number) {
        // Use 'this' to refer to the instance variable
        this.number = number;
    }

    public int getNumber() {
        return this.number;
    }

    // b) Invoking another constructor
    public ThisKeywordExamples(int number, String text) {
        this.number = number;
        this.text = text;
    }

    public ThisKeywordExamples(int number) {
        this(number, "Default Text");
    }

    public void displayValues() {
        System.out.println("Number: " + number);
        System.out.println("Text: " + text);
    }

    // c) Passing current object as a parameter
    public void processData(ThisKeywordExamples anotherObject) {
        int sum = this.number + anotherObject.number;
        System.out.println("Sum: " + sum);
    }

    // d) Returning current object
    public ThisKeywordExamples setNumberAndReturn(int number) {
        this.number = number;
        return this;
    }

    public void displayValue() {
        System.out.println("Number: " + number);
    }

    public static void main(String[] args) {
        // a) Referencing instance variable
        ThisKeywordExamples obj1 = new ThisKeywordExamples();
        obj1.setNumber(42);
        System.out.println("Number: " + obj1.getNumber());

        // b) Invoking another constructor
        ThisKeywordExamples obj2 = new ThisKeywordExamples(42, "Hello, World!");
        obj2.displayValues();

        ThisKeywordExamples obj3 = new ThisKeywordExamples(17);
        obj3.displayValues();

        // c) Passing current object as a parameter
        ThisKeywordExamples obj4 = new ThisKeywordExamples(30);
        ThisKeywordExamples obj5 = new ThisKeywordExamples(15);
        obj4.processData(obj5);

        // d) Returning current object
        ThisKeywordExamples obj6 = new ThisKeywordExamples();
        obj6.setNumberAndReturn(10).displayValue();
    }
}
