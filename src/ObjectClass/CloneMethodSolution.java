package ObjectClass;

/*
when we override this object class method , we can create a independent object without using new keyword
rules:
1.) implements cloneable marker interface
2.) throws CloneNotSupportedException in method signature
3.) type cast , because object class returns Object nd we want custom, like student , vehicle etc.
4.) object class method is protected so we can make it public or protected but not default
*/

class Address1 {
    String city;
}

public class CloneMethodSolution implements Cloneable {
    int enrollId;
    String name;
    Address1 address;


    public CloneMethodSolution(int enrollId, String name, Address1 address) {
        this.enrollId = enrollId;
        this.name = name;
        this.address = address;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        CloneMethodSolution c = (CloneMethodSolution) super.clone();
        // deep copy
        Address1 newAddress = new Address1();
        newAddress.city = this.address.city;
        c.address = newAddress;
        return c;
    }

    public void showDetails() {
        System.out.println(enrollId + " , " + name + " , " + " , " + address.city);
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        Address1 address = new Address1();
        address.city = "Hyd";
        CloneMethodSolution cm = new CloneMethodSolution(101, "Noorain", address);
        cm.showDetails();

        // now we will clone
        CloneMethodSolution cm1 = (CloneMethodSolution) cm.clone();
        cm1.showDetails();

        System.out.println("after changing states using cm1 : lets see the effect on cm");
        cm1.address.city = "Dubai";
        cm.showDetails();
        cm1.showDetails();
    }
}
