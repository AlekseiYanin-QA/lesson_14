import java.util.ArrayList;
import java.util.HashSet;

public class RemoveDuplicates {
    public static void removeDuplicates(ArrayList<String> list) {
        HashSet<String> set = new HashSet<>(list);
        list.clear();
        list.addAll(set);
    }
}
