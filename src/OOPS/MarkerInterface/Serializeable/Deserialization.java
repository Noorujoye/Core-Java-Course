package OOPS.MarkerInterface.Serializeable;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Deserialization {

    public Account deserialize(String filename) {
        System.out.println("\nstarting deserialization process");

        try {
            File file = new File(filename);
            FileInputStream fis = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(fis);

            // read the file and convert back to object of Account type
            Account deserializedObj = (Account) ois.readObject();
            System.out.println("deserialization successfully...");
            return deserializedObj;
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Deserialization failed: " + e.getMessage());
            return null;
        }
    }
}
