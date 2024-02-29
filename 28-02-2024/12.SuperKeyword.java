public class SuperKeywordExamples {
    // a) Accessing superclass members
    public static class Animal1 {
        String sound = "Animal Sound";
    }

    public static class Dog1 extends Animal1 {
        void displaySound() {
            // Accessing the superclass member using 'super'
            System.out.println("Dog Sound: " + super.sound);
        }
    }

    // b) Calling superclass constructor
    public static class Animal {
        String sound;

        Animal(String sound) {
            this.sound = sound;
        }
    }

    public static class Dog extends Animal {
        Dog(String sound) {
            super(sound);
        }

        void displaySound() {
            System.out.println("Dog Sound: " + super.sound);
        }
    }

    // c) Invoking superclass method
    public static class Animal2 {
        void eat() {
            System.out.println("Animal is eating");
        }
    }

    public static class Dog2 extends Animal2 {
        void eat() {
            super.eat();
            System.out.println("Dog is eating");
        }
    }

    public static void main(String[] args) {
        // a) Accessing superclass members
        Dog1 myDog1 = new Dog1();
        myDog1.displaySound();

        // b) Calling superclass constructor
        Dog myDog = new Dog("Woof!");
        myDog.displaySound();

        // c) Invoking superclass method
        Dog2 myDog2 = new Dog2();
        myDog2.eat();
    }
}
