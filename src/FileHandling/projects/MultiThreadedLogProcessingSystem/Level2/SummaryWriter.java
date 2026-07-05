package FileHandling.projects.MultiThreadedLogProcessingSystem.Level2;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

public class SummaryWriter {

    public void writeSummary(String outputPath, Map<String, Integer> summary) {

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(outputPath))) {
            for (Map.Entry<String, Integer> entry : summary.entrySet()) {

                bw.write(entry.getKey() + " : " + entry.getValue());

                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
