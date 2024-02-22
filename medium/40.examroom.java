import java.util.ArrayList;
import java.util.List;

public class examroom {
    private int n;
    private List<Integer> seats;

    public examroom(int n) {
        this.n = n;
        this.seats = new ArrayList<>();
    }

    public int seat() {
        if (seats.isEmpty()) {
            seats.add(0);
            return 0;
        }

        int prev = seats.get(0);
        int dist = prev;
        int index = 0;
        for (int i = 1; i < seats.size(); i++) {
            int curr = seats.get(i);
            int newDist = (curr - prev) / 2;
            if (newDist > dist) {
                dist = newDist;
                index = (prev + curr) / 2;
            }
            prev = curr;
        }

        if (prev < n - 1 && (n - 1 - prev) > dist) {
            index = n - 1;
        }

        seats.add(index);
        return index;
    }

    public void leave(int p) {
        seats.remove(Integer.valueOf(p));
    }

    public static void main(String[] args) {
        examroom examRoom = new examroom(10);
        System.out.println(examRoom.seat()); // 0
        System.out.println(examRoom.seat()); // 9
        System.out.println(examRoom.seat()); // 4
        System.out.println(examRoom.seat()); // 2
        examRoom.leave(4);
        System.out.println(examRoom.seat()); // 5
    }
}