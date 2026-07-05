package FileHandling.Streams.ByteStreams;

import java.io.*;

public class FileInputStreamsClass {

    public void copyImage(String img, String destination) {
        try (FileInputStream fis = new FileInputStream(img);
             FileOutputStream fos = new FileOutputStream(destination)
        ) {
            byte[] buffer = new byte[1024];
            int bytesRead;
            while ((bytesRead = fis.read(buffer)) != -1) {
                fos.write(buffer, 0, bytesRead);
            }
            System.out.println("Image copied...");
        } catch (FileNotFoundException e) {
            System.out.println("file not found exception : " + e);
        } catch (IOException e) {
            System.err.println("Unable to copy image.");
        }
    }

    public void readText(File img) {

    }
}
