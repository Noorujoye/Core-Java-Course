package FileHandling.projects.MultiThreadedLogProcessingSystem.Level3;

public class LogConsumer extends Thread {

    private final SharedQueue queue;
    private final LogAnalyzer analyzer;

    public LogConsumer(SharedQueue queue,
                       LogAnalyzer analyzer) {
        this.queue = queue;
        this.analyzer = analyzer;
    }

    @Override
    public void run() {
        System.out.println("consumer Thread " + Thread.currentThread().getName());

        try {
            while (true) {

                String line = queue.take();
                if (line == null) break;
                System.out.println(
                        Thread.currentThread().getName()
                                + " Consumer : " + line);
                analyzer.analyze(line);
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            e.printStackTrace();
        }
    }
}
