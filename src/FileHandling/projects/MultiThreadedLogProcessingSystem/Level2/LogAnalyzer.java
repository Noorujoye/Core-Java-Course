package FileHandling.projects.MultiThreadedLogProcessingSystem.Level2;

import java.util.HashMap;
import java.util.Map;

public class LogAnalyzer {

    private final Map<String, Integer> map = new HashMap<>();

    public void analyze(String line) {
        if (line.contains("ERROR 500")) {
            map.put("ERROR 500",
                    map.getOrDefault("ERROR 500", 0) + 1);

        } else if (line.contains("ERROR 404")) {
            map.put("ERROR 404",
                    map.getOrDefault("ERROR 404", 0) + 1);

        } else if (line.contains("ERROR 403")) {
            map.put("ERROR 403",
                    map.getOrDefault("ERROR 403", 0) + 1);

        } else if (line.contains("INFO")) {
            map.put("INFO",
                    map.getOrDefault("INFO", 0) + 1);

        } else if (line.contains("WARN")) {
            map.put("WARN",
                    map.getOrDefault("WARN", 0) + 1);
        }
    }

    public Map<String, Integer> getSummary() {
        return map;
    }
}
