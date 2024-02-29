public class Pair<K, V> {
    private K key;
    private V value;

    // Constructor
    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    // Getter and Setter for key
    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    // Getter and Setter for value
    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }

    public static void main(String[] args) {
        // Creating a Pair with Integer key and String value
        Pair<Integer, String> pair1 = new Pair<>(1, "One");

        // Creating a Pair with String key and Double value
        Pair<String, Double> pair2 = new Pair<>("PI", 3.14);

        // Getting key-value pairs
        System.out.println("Pair 1: Key=" + pair1.getKey() + ", Value=" + pair1.getValue());
        System.out.println("Pair 2: Key=" + pair2.getKey() + ", Value=" + pair2.getValue());

        // Setting new values
        pair1.setKey(42);
        pair2.setValue(2.71);

        // Getting updated key-value pairs
        System.out.println("Updated Pair 1: Key=" + pair1.getKey() + ", Value=" + pair1.getValue());
        System.out.println("Updated Pair 2: Key=" + pair2.getKey() + ", Value=" + pair2.getValue());
    }
}
