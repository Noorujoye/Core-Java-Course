package FileHandling.projects.MultiThreadedLogProcessingSystem.Level1;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

public class SummaryWriter {

    public void writeSummary(Map<String, Integer> map, String outputPath) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(outputPath))) {
            for (Map.Entry<String, Integer> entry : map.entrySet()) {
                bw.write(entry.getKey() + " : " + entry.getValue());
                bw.newLine();
            }
        } catch (FileNotFoundException e) {
            System.out.println("file not found : " + e);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
