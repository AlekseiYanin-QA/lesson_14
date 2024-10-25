import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        // Первое задание
        System.out.println("Выполнение первого задания");

        HashMap<Integer, String> originalMap = new HashMap<>();
        originalMap.put(1, "Один");
        originalMap.put(2, "Два");
        originalMap.put(3, "Три");

        HashMap<String, Integer> swappedMap = SwapKeysAndValues.swapKeysAndValues(originalMap);

        System.out.println("Исходный HashMap: " + originalMap);
        System.out.println("Измененный HashMap: " + swappedMap);

        // Второе задание
        System.out.println("\nВыполнение второго задания");

        ArrayList<Integer> arrayList = ListPerformanceTest.createArrayList();
        LinkedList<Integer> linkedList = ListPerformanceTest.createLinkedList();

        for (int i = 0; i < 1000; i++) {
            arrayList.get(new Random().nextInt(arrayList.size()));
            linkedList.get(new Random().nextInt(linkedList.size()));
        }

        long arrayListTime = ListPerformanceTest.measureTime(() -> arrayList.get(new Random().nextInt(arrayList.size())));
        long linkedListTime = ListPerformanceTest.measureTime(() -> linkedList.get(new Random().nextInt(linkedList.size())));


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

        RemoveDuplicates.removeDuplicates(strings);

        System.out.println(strings);
    }

}

//1. ArrayList: реализация на основе массива, доступ к элементам по индексу осуществляется за O(1) — очень быстро.
//        2. LinkedList: состоит из узлов, каждый из которых содержит ссылку на предыдущий и следующий элементы. Чтобы достать элемент по индексу, нужно пройтись по списку — это O(n) в худшем случае.
//
//Из-за этого в большинстве случаев ArrayList будет значительно быстрее LinkedList при доступе по индексу.

