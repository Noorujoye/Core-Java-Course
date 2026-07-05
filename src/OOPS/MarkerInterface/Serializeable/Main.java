package OOPS.MarkerInterface.Serializeable;

public class Main {
    public static void main(String[] args) {
        String file = "account.ser";

        // using factory pattern to get the object
        Account account = AppFactory.createAccount();
        System.out.println("Account Details : \n");
        account.getAccountDetails();

        // serialization
        Serialization serializer = new Serialization();
        serializer.serialize(account, file);

        // deserialization
        Deserialization deserializer = new Deserialization();
        Account recoverAccount = deserializer.deserialize(file);

        System.out.println("\nRecovered Account : ");
        if (recoverAccount != null) {
            recoverAccount.getAccountDetails();
        }
    }
}
