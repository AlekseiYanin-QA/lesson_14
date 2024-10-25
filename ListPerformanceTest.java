import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;

public class ListPerformanceTest {
    private static final int SIZE = 1_000_000;
    private static final Random random = new Random();

    public static ArrayList<Integer> createArrayList() {
        ArrayList<Integer> list = new ArrayList<>(SIZE);
        for (int i = 0; i < SIZE; i++) {
            list.add(random.nextInt(100));
        }
        return list;
    }

    public static LinkedList<Integer> createLinkedList() {
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 0; i < SIZE; i++) {
            list.add(random.nextInt(100));
        }
        return list;
    }

    public static long measureTime(Runnable runnable) {
        long startTime = System.currentTimeMillis();
        runnable.run();
        long endTime = System.currentTimeMillis();
        return endTime - startTime;
    }
}