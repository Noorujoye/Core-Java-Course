package FileHandling.Streams.ByteStreams;

public class Operation {

    public static void main() throws Exception {

        // copy Image to destination...
        FileInputStreamsClass fs = new FileInputStreamsClass();
        String noorImg = "D:\\JAVA\\CORE-JAVA-5\\src\\FileHandling\\Images\\noorain.jpg";
        String destination = "D:\\JAVA\\CORE-JAVA-5\\src\\FileHandling\\Images\\Destination\\copyNoor.jpg";
        fs.copyImage(noorImg, destination);

        // copy Image to destination using BufferedInputStream , to reduce the disk call again-again
    }
}
