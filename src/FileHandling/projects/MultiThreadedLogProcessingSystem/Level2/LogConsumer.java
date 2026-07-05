package FileHandling.projects.MultiThreadedLogProcessingSystem.Level2;

public class LogConsumer {

    private final SharedQueue queue;
    private final LogAnalyzer analyzer;

    public LogConsumer(SharedQueue queue,
                       LogAnalyzer analyzer) {

        this.queue = queue;
        this.analyzer = analyzer;
    }

    public void consume() {
        while (!queue.isEmpty()) {
            String line = queue.take();
            System.out.println("Consumed : " + line);
            analyzer.analyze(line);
        }
    }
}
