package FileHandling.Streams.CharacterStreams;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class FileReaderClass {
    static void main() {
        String src = "D:\\JAVA\\CORE-JAVA-5\\src\\FileHandling\\Files\\Destination\\filewriteroutput.txt";
        try {
            Reader reader = new FileReader(src);
            int i;
            while ((i = reader.read()) != -1) {
                System.out.print((char) i);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
