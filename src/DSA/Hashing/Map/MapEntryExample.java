package DSA.Hashing.Map;

import java.util.*;

public class MapEntryExample {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> ages = new LinkedHashMap<>();
        ages.put("Alice", 30);
        ages.put("bob", 25);
        ages.put("Charlie", 35);

        // Get a Set of all entries
        for (Map.Entry<String, Integer> entry : ages.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
        // Output: Key: Alice, Value: 30
        //         Key: Bob, Value: 25
        //         Key: Charlie, Value: 35 (order may vary for HashMap)

        // using Map.Entry with java stream
        Map<String, Integer> scores = new HashMap<>();
        scores.put("Math", 90);
        scores.put("Science", 85);
        scores.put("History", 95);

        scores.entrySet().stream()
                .filter(entry -> entry.getValue() > 88)
                .forEach(entry -> System.out.println("subject: " + entry.getKey() + "marks: " + entry.getValue()));
    }
}

