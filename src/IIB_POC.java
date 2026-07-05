import java.util.UUID;

class DBConnection {

    {
        System.out.println("hello");
    }

    String url = "www.xyx.com";
    String username = "MySQL";
    String password = "123456";

    //    there is no competition btw instance variable and IIB , order matters
    {
        System.out.println("database is connecting...");
    }

    public DBConnection() {
        System.out.println("connected...");
    }
}

class User {

    String id;
    long createdAt;

    // IIB
    {
        id = UUID.randomUUID().toString();
        createdAt = System.currentTimeMillis();

        System.out.println("Common initialization");
    }

    User() {
        System.out.println("Default constructor");
    }

    User(String name) {
        this();
        System.out.println("Name constructor");
    }

    User(String name, int age) {
        this(name);
        System.out.println("Name+Age constructor");
    }
}

public class IIB_POC extends User {

    IIB_POC(String name, int age) {
        super(name, age);
        System.out.println("I will print at last..." + id + " : " + createdAt);
    }

    public static void main(String[] args) {
//        IIB_POC u3 = new IIB_POC("Noorain", 21);
//        DBConnection d = new DBConnection();
//        System.out.println("hiii");
        new Child();


    }
}


class Parent {

    {
        System.out.println("Parent IIB");
    }

    Parent() {
        System.out.println("Parent Constructor");
    }
}

class Child extends Parent {

    {
        System.out.println("Child IIB");
    }

    Child() {
        System.out.println("Child Constructor");
    }
}