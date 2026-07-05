package FileHandling.Streams.CharacterStreams;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterClass {
    static void main() {

//        String source = "My Name is Noorain Warsi";
        String source = "D:\\JAVA\\CORE-JAVA-5\\src\\FileHandling\\Files\\Destination\\filewriteroutput.txt";
        String destination = "D:\\JAVA\\CORE-JAVA-5\\src\\FileHandling\\Files\\Destination\\filewriteroutput.txt";

        try {
            FileReader reader = new FileReader(source);
            FileWriter fw = new FileWriter(destination, true);
            int i;
            while ((i = reader.read()) != -1) {
                fw.write(i);
            }
            fw.close();
            reader.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
