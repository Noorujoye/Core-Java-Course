package FileHandling;

import java.io.File;
import java.io.IOException;

public class FileBasicOperations {
    static void main() {
        File newDir = new File("D:\\JAVA\\CORE-JAVA-5\\src\\FileHandling\\BasicFolder");
        try {
            newDir.mkdir();
            System.out.println(newDir.createNewFile());
            System.out.println("Is it directory : " + newDir.isDirectory());
            File newFile = new File(newDir + "\\BasicOperationOnFile.java");
            newFile.createNewFile();
            System.out.println("File created " + newFile.getName());
            System.out.println("Is file exists " + newFile.exists());
            System.out.println(newDir.listFiles());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
/*
Try this all methods---
1. File Management (java.io.File)
|
├── File
│   ├── createNewFile()
│   ├── delete()
│   ├── exists()
│   ├── mkdir()
│   ├── mkdirs()
│   ├── listFiles()
│   ├── getName()
│   ├── getPath()
│   ├── getAbsolutePath()
│   ├── isFile()
│   ├── isDirectory()
│   ├── canRead()
│   ├── canWrite()
│   └── length()
 */
