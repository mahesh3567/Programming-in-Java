public class Singleton {
    private static Singleton instance;

    private Singleton() {
        if (instance != null) {
            throw new IllegalStateException("Singleton class allows only one instance.");
        }
    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public static void main(String[] args) {
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();

        System.out.println("singleton1 == singleton2: " + (singleton1 == singleton2));
    }
}