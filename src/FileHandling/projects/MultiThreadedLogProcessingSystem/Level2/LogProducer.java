package FileHandling.projects.MultiThreadedLogProcessingSystem.Level2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class LogProducer {

    private final SharedQueue queue;

    public LogProducer(SharedQueue queue) {
        this.queue = queue;
    }

    // only read file
    public void produce(String path) {

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line;
            while ((line = br.readLine()) != null) {
                queue.put(line);
                System.out.println("Produced : " + line);
            }
        } catch (FileNotFoundException e) {
            System.err.println("file not found exception : " + e);
        } catch (IOException e) {
            System.err.println("Unable to produce");
        }
    }
}
