import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Random;
import static src.ListPerformanceTest.*;
import static src.RemoveDuplicates.*;
import static src.SwapKeysAndValues.*;


public class Main {
    public static void main(String[] args) {
        // Первое задание
        System.out.println("Выполнение первого задания");

        HashMap<Integer, String> originalMap = new HashMap<>();
        originalMap.put(1, "Один");
        originalMap.put(2, "Два");
        originalMap.put(3, "Три");

        HashMap<String, Integer> swappedMap = swapKeysAndValues(originalMap);

        System.out.println("Исходный HashMap: " + originalMap);
        System.out.println("Измененный HashMap: " + swappedMap);

        // Второе задание
        System.out.println("\nВыполнение второго задания");

        ArrayList<Integer> arrayList = createArrayList();
        LinkedList<Integer> linkedList = createLinkedList();

        for (int i = 0; i < 1000; i++) {
            arrayList.get(new Random().nextInt(arrayList.size()));
            linkedList.get(new Random().nextInt(linkedList.size()));
        }

        long arrayListTime = measureTime(() -> arrayList.get(new Random().nextInt(arrayList.size())));
        long linkedListTime = measureTime(() -> linkedList.get(new Random().nextInt(linkedList.size())));


        System.out.println("Время выполнения для ArrayList: " + arrayListTime + " ms");
        System.out.println("Время выполнения для LinkedList: " + linkedListTime + " ms");

        if (arrayListTime < linkedListTime) {
            System.out.println("ArrayList быстрее LinkedList.");
        } else {
            System.out.println("LinkedList быстрее ArrayList.");
        }

        // Третье задание
        System.out.println("\nВыполнение третьего задания");

        ArrayList<String> strings = new ArrayList<>();
        strings.add("яблоко");
        strings.add("банан");
        strings.add("яблоко");
        strings.add("апельсин");
        strings.add("банан");
        strings.add("арбуз");

        removeDuplicates(strings);

        System.out.println(strings);
    }

}
