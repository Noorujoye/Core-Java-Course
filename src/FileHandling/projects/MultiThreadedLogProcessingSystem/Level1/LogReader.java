package FileHandling.projects.MultiThreadedLogProcessingSystem.Level1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LogReader {

    public void readLogs(String path, LogAnalyzer analyzer) {
        String line = "";
        try (BufferedReader br =
                     new BufferedReader(new FileReader(path))) {
            while ((line = br.readLine()) != null) {
                analyzer.analyze(line);
            }
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
