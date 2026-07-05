package FileHandling.projects.MultiThreadedLogProcessingSystem.Level3;

public class Main {
    static void main() throws InterruptedException {

        String src = "D:\\JAVA\\CORE-JAVA-5\\src\\FileHandling\\projects\\MultiThreadedLogProcessingSystem\\logFiles\\error.log";
        String outputPath = "D:\\JAVA\\CORE-JAVA-5\\src\\FileHandling\\projects\\MultiThreadedLogProcessingSystem\\logFiles\\summary.txt";

        SharedQueue sharedQueue = new SharedQueue(); // shared resource

        LogProducer producer = new LogProducer(sharedQueue, src);
        LogAnalyzer analyzer = new LogAnalyzer();
        LogConsumer consumer = new LogConsumer(sharedQueue, analyzer);
        SummaryWriter writer = new SummaryWriter();

        producer.start();
        consumer.start();
        producer.join();
        consumer.join();

        writer.writeSummary(outputPath, analyzer.getSummary());
        System.out.println("complete!!!");
    }
}
