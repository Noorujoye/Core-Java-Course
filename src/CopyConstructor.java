class Address {
    String city;

    public Address(String city) {
        this.city = city;
    }
}

public class CopyConstructor {

    int id;
    String name;
    Address address;

    public CopyConstructor(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public CopyConstructor(int id, String name, Address address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    //Copy constructor with chaining
    public CopyConstructor(CopyConstructor other) {
        this(
                other.id,
                other.name,
                other.address == null ? null : new Address(other.address.city) // deep copy
        );
    }

    public static void main(String[] args) {
        CopyConstructor c1 = new CopyConstructor(101, "Noorain");
        CopyConstructor c2 = new CopyConstructor(c1);
        c2.name = "virat";
        c2.id = 102;
        System.out.println(c1.id + " : " + c1.name);
        System.out.println(c2.id + " : " + c2.name);


        Address address = new Address("hyd");
        CopyConstructor c3 = new CopyConstructor(103, "rohit", address);
        System.out.println(c3.id + " : " + c3.name + " : " + c3.address.city);

        CopyConstructor c4 = new CopyConstructor(c3);
        c4.id = 104;
        c4.name = "gill";
        c4.address.city = "dubai";
        System.out.println("after changing states: \n" + c3.id + " : " + c3.name + " : " + c3.address.city);
        System.out.println(c4.id + " : " + c4.name + " : " + c4.address.city);
        try {
//            if (c2.address == null) {
//                System.out.println("obj is null");
//                return;
//            }
            String ans = null;
            System.out.println(c2.id + " : " + c2.name + " : " + c2.address == null ? ans : c2.address.city);
        } catch (NullPointerException n) {
            System.out.println(n.getMessage());
        }
    }
}
