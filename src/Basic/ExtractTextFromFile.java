package Basic;

import java.awt.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExtractTextFromFile {
    public static void main(String[] args) {

        try {
            File file = new File("D:\\JAVA\\CORE-JAVA-5\\src\\Basic\\dsaInterview.pdf");

            if (file.exists()) {
                Desktop.getDesktop().open(file);
            } else {
                System.out.println("File not found...");
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
