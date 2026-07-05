package OOPs;

public class classes_objects {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.change_name("Noorain");

        BankAccount myAcc = new BankAccount();
        myAcc.setPassword("123456");
    }
}
class Student {
    String name = " shama";

    void change_name(String nam) {
        name = nam;
        System.out.println(name);
    }
}
class BankAccount {
    public String username = "Shama";
    private String password;
    public void setPassword(String pass) {
        password = pass;
        System.out.println(password);
    }
}


//getters and setters





