package FileHandling;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Try {
    public static void main() {

        String input = "D:\\JAVA\\CORE-JAVA-5\\src\\FileHandling\\projects\\MultiThreadedLogProcessingSystem\\logFiles\\error.log";
        String output = "D:\\JAVA\\CORE-JAVA-5\\src\\FileHandling\\projects\\MultiThreadedLogProcessingSystem\\logFiles\\summary.txt";

        Map<String, Integer> map = new HashMap<>();


        String txt = "";

        try (BufferedReader br = new BufferedReader(new FileReader(input));
             BufferedWriter bw = new BufferedWriter(new FileWriter(output))
        ) {

            while ((txt = br.readLine()) != null) {

                if (txt.contains("ERROR 500")) {
                    map.put("ERROR 500",
                            map.getOrDefault("ERROR 500", 0) + 1);

                } else if (txt.contains("ERROR 404")) {
                    map.put("ERROR 404",
                            map.getOrDefault("ERROR 404", 0) + 1);

                } else if (txt.contains("ERROR 403")) {
                    map.put("ERROR 403",
                            map.getOrDefault("ERROR 403", 0) + 1);

                } else if (txt.contains("INFO")) {
                    map.put("INFO",
                            map.getOrDefault("INFO", 0) + 1);

                } else if (txt.contains("WARN")) {
                    map.put("WARN",
                            map.getOrDefault("WARN", 0) + 1);
                }
            }
            for (Map.Entry<String, Integer> e : map.entrySet()) {
                bw.write(e.getKey() + " : " + e.getValue());
                bw.newLine();
            }
            System.out.println("Summary Generated Successfully.");
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
