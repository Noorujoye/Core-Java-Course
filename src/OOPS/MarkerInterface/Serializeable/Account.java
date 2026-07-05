package OOPS.MarkerInterface.Serializeable;

import java.io.Serializable;

public class Account implements Serializable {
    private static final long serialVersionUID = 1L;

    private String accountNumber;
    private String username;
    private static String country = "India";
    private transient String accountBalance;

    public Account() {

    }

    public Account(String accountNumber, String accountBalance, String username) {
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
        this.username = username;
    }

    void getAccountDetails() {
        System.out.println("Account Number   : " + this.accountNumber +
                "\nAccount Balance  : " + this.accountBalance +
                "\nAccount username : " + this.username +
                "\nAccount country  : " + country
        );
    }
}