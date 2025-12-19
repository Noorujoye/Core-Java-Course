package FileHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.util.Scanner;

public class CreateFileAndGetInformation {
    public static void main(String[] args) throws IOException {
        File file = new File("D:\\file.txt");
        if (file.exists())  {
            try {
                FileOutputStream f = new FileOutputStream(file);
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter your content");
                String s = sc.nextLine();
                f.write(s.getBytes(StandardCharsets.UTF_8));

                // now read from file


                FileInputStream fileInputStream = new FileInputStream(file);
                byte[] bytes= fileInputStream.readAllBytes();
                String read = new String(bytes , StandardCharsets.UTF_8);
                System.out.println(read);



            } catch (IOException e) {
                System.out.println("No input");
            }
        } else {
            System.out.println("file not exist");
        }
    }
}
