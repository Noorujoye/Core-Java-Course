package OOPS.MarkerInterface.Serializeable;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Serialization {
    public void serialize(Account account, String filename) {
        System.out.println("starting serialization process");
        try {
            File file = new File(filename);
            FileOutputStream fos = new FileOutputStream(file);
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(account); //serialized
            System.out.println("object serialized successfully : " + filename);
        } catch (IOException e) {
            System.out.println("Serialization failed: " + e.getMessage());
        }
    }
}
