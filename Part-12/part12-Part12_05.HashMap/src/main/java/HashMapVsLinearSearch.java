import java.util.HashMap;
import java.util.ArrayList;
import java.util.Random;

public class HashMapVsLinearSearch {
    public static void main(String[] args) {
        // Create and populate the HashMap
        HashMap<Integer, String> hashMap = new HashMap<>();
        ArrayList<Entry> list = new ArrayList<>();
        Random random = new Random();
        
        int keyToFind = 99999; // We'll search for this key
        String valueToFind = "value99999";

        // Populate HashMap and ArrayList
        for (int i = 0; i < 100000; i++) {
            int key = i;
            String value = "value" + i;
            hashMap.put(key, value);
            list.add(new Entry(key, value));
        }

        // Benchmark HashMap search
        long hashMapStartTime = System.nanoTime();
        String hashMapResult = hashMap.get(keyToFind);
        long hashMapEndTime = System.nanoTime();
        long hashMapDuration = hashMapEndTime - hashMapStartTime;

        // Benchmark Linear search
        long linearSearchStartTime = System.nanoTime();
        String linearSearchResult = null;
        for (Entry entry : list) {
            if (entry.key == keyToFind) {
                linearSearchResult = entry.value;
                break;
            }
        }
        long linearSearchEndTime = System.nanoTime();
        long linearSearchDuration = linearSearchEndTime - linearSearchStartTime;

        // Print results
        System.out.println("HashMap search result: " + hashMapResult);
        System.out.println("HashMap search time: " + hashMapDuration + " ns");

        System.out.println("Linear search result: " + linearSearchResult);
        System.out.println("Linear search time: " + linearSearchDuration + " ns");
    }

    static class Entry {
        int key;
        String value;

        Entry(int key, String value) {
            this.key = key;
            this.value = value;
        }
    }
}
