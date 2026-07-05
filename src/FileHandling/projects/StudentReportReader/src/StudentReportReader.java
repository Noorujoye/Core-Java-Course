package FileHandling.projects.StudentReportReader.src;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class StudentReportReader {
    static void main() {

        String source = "D:\\JAVA\\CORE-JAVA-5\\src\\FileHandling\\projects\\StudentReportReader\\student.txt";
        String destination = "D:\\JAVA\\CORE-JAVA-5\\src\\FileHandling\\projects\\StudentReportReader\\output\\output.txt";

        try (FileInputStream fis = new FileInputStream(source);
             FileOutputStream fos = new FileOutputStream(destination, true)) {
            long start = System.currentTimeMillis();
            int data;
            while ((data = fis.read()) != -1) {
                Thread.sleep(100);
                fos.write(data);
                System.out.println(data);
            }
            long end = System.currentTimeMillis();
            System.out.println(end - start);
        } catch (FileNotFoundException e) {
            System.err.println("Source file not found: " + source);
        } catch (IOException e) {
            throw new RuntimeException("Error while reading file.", e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
