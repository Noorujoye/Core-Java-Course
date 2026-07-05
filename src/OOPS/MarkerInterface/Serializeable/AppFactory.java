package OOPS.MarkerInterface.Serializeable;

public class AppFactory {
    public static Account createAccount() {
        return new Account("1", "5000.0", "Noorain");
    }

    public static Account accountInstance() {
        return new Account();
    }
}
