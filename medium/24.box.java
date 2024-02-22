public class Box {

    private double length;
    private double width;
    private double height;

    // Default constructor method
    public Box() {
        this.length = 1.0;
        this.width = 1.0;
        this.height = 1.0;
    }

    public double getVolume() {
        return length * width * height;
    }

    public static void main(String[] args) {
        Box box = new Box();
        double volume = box.getVolume();
        System.out.println("The volume of the box is: " + volume);
    }
}