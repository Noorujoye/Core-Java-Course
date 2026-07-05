package FileHandling.projects.MultiThreadedLogProcessingSystem.Level2;

public class Main {
    static void main() {

        String src = "D:\\JAVA\\CORE-JAVA-5\\src\\FileHandling\\projects\\MultiThreadedLogProcessingSystem\\logFiles\\error.log";
        String outputPath = "D:\\JAVA\\CORE-JAVA-5\\src\\FileHandling\\projects\\MultiThreadedLogProcessingSystem\\logFiles\\summary.txt";
        SharedQueue sharedQueue = new SharedQueue();
        LogProducer producer = new LogProducer(sharedQueue);
        LogAnalyzer analyzer = new LogAnalyzer();
        LogConsumer consumer = new LogConsumer(sharedQueue, analyzer);
        SummaryWriter writer = new SummaryWriter();

        producer.produce(src);
        consumer.consume();
        writer.writeSummary(outputPath, analyzer.getSummary());
        System.out.println("complete!!!");
    }
}
