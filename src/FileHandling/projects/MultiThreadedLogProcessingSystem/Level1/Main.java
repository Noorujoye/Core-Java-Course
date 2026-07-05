package FileHandling.projects.MultiThreadedLogProcessingSystem.Level1;

public class Main {

    static void main() {

        String input = "D:\\JAVA\\CORE-JAVA-5\\src\\FileHandling\\projects\\MultiThreadedLogProcessingSystem\\logFiles\\error.log";
        String output = "D:\\JAVA\\CORE-JAVA-5\\src\\FileHandling\\projects\\MultiThreadedLogProcessingSystem\\logFiles\\summary.txt";

        LogReader reader = new LogReader();
        LogAnalyzer analyzer = new LogAnalyzer();
        SummaryWriter writer = new SummaryWriter();
        reader.readLogs(input, analyzer);
        writer.writeSummary(analyzer.getSummary(), output);
    }
}
