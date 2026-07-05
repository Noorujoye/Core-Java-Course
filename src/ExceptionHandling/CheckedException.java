package ExceptionHandling;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class CheckedException implements Cloneable {
    private static final String url = "jdbc:mysql://localhost:3306/exception?createDatabaseIfNotExist=true";
    private static final String userName = "root";
    private static final String password = "#CSE2828#";

    public static void connection() {
        try {
            Connection connection = DriverManager.getConnection(url, userName, password);
            System.out.println("Database Connected...");
        } catch (SQLException e) {
            System.out.println(e.getMessage() + "database exception");
        }
    }
//    public static void readFile() {
//        try {
//            BufferedReader f = new BufferedReader(new FileReader("README.md"));
//            FileReader openFile = new FileReader("README.md");
//            String line;
//            while ((line = f.readLine()) != null) {
//                System.out.println(line);
//            }
//        } catch (FileNotFoundException f) {
//            System.out.println(f.getMessage());
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//    }

//    @Override
//    public Object clone() {
//        try {
//            return super.clone();
//        } catch (CloneNotSupportedException e) {
//            throw new RuntimeException(e.getMessage());
//        }
//    }
//
//    @Override
//    public boolean equals(Object obj) {
//
//        // 1. Same reference?
//        if (this == obj) return true;
//
//        // 2. Null check
//        if (obj == null) return false;
//
//        // 3. Class check
//        if (getClass() != obj.getClass()) return false;
//
//        // 4. Type cast
//        CheckedException other = (CheckedException) obj;
//
//        // 5. Compare fields
//        return this.url.equals(other.url) &&
//                this.userName.equals(other.userName) &&
//                this.password.equals(other.password);
//    }

    public static void main(String[] args) {
        CheckedException c = new CheckedException();
        c.connection();
//        c.readFile();
//        CheckedException c1 = (CheckedException) c.clone();
//       c1.connection();
//        System.out.println(c == c1);
//         System.out.println(c.equals(c1));
    }
}