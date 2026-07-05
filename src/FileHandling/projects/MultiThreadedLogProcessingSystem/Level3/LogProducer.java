package FileHandling.projects.MultiThreadedLogProcessingSystem.Level3;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class LogProducer extends Thread {

    private final SharedQueue queue;
    private final String inputPath;

    public LogProducer(SharedQueue queue, String inputPath) {
        this.queue = queue;
        this.inputPath = inputPath;
    }

    @Override
    public void run() {

        System.out.println("producer thread" + Thread.currentThread().getName());

        try (BufferedReader br = new BufferedReader(new FileReader(inputPath))) {

            String line;
            while ((line = br.readLine()) != null) {
                if (line.isBlank()) continue;
                queue.put(line);
                System.out.println(
                        Thread.currentThread().getName()
                                + " Produced : " + line);
            }
        } catch (FileNotFoundException e) {
            System.err.println("file not found exception : " + e);
        } catch (IOException | InterruptedException e) {
            System.err.println("Unable to produce : " + e);
        } finally {
            queue.markProductionCompleted();
        }
    }
}
