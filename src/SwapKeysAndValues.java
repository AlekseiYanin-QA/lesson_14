package src;
import java.util.HashMap;

public class SwapKeysAndValues {
    public static HashMap<String, Integer> swapKeysAndValues(HashMap<Integer, String> map) {
        HashMap<String, Integer> swappedMap = new HashMap<>();
        for (HashMap.Entry<Integer, String> entry : map.entrySet()) {
            swappedMap.put(entry.getValue(), entry.getKey());
        }
        return swappedMap;
    }
}
