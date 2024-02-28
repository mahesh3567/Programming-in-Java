
public class parentclass {
    public static void main(String[] args) {
        Child child = new Child();
        child.even();
        System.out.println();
        child.odd();
        System.out.println();
        child.prime();
    }
}
class Parent {
    void even() {
        System.out.println("Even numbers from 1 to 20:");
        for (int i = 1; i <= 20; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }

    void odd() {
        System.out.println("Odd numbers from 1 to 20:");
        for (int i = 1; i <= 20; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }

    void prime() {
        System.out.println("Prime numbers from 1 to 20:");
        for (int i = 2; i <= 20; i++) {
            if (isPrime(i)) {
                System.out.println(i);
            }
        }
    }

    boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}

class Child extends Parent {
    @Override
    void even() {
        System.out.println("Even numbers from 1 to 30:");
        for (int i = 1; i <= 30; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }

    @Override
    void odd() {
        System.out.println("Odd numbers from 1 to 30:");
        for (int i = 1; i <= 30; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }

    @Override
    void prime() {
        System.out.println("Prime numbers from 1 to 30:");
        for (int i = 2; i <= 30; i++) {
            if (isPrime(i)) {
                System.out.println(i);
            }
        }
    }
}
