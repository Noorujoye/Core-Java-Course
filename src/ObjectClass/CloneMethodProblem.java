package ObjectClass;

/*
when we override this object class method , we can create independent object without using new keyword

rules:
1.) implements cloneable marker interface
2.) throws CloneNotSupportedException in method signature
3.) type cast , because object class returns Object nd we want custom, like student , vehicle etc.
4.) object class method is protected so we can make it public or protected but not default
*/
class Address {
    String city;
}

class Computer {
    int sysNo;
    String brand;

}

public class CloneMethodProblem implements Cloneable {
    int enrollId;
    String name;
    Address address;
    Computer computer;


    public CloneMethodProblem(int enrollId, String name, Address address, Computer computer) {
        this.enrollId = enrollId;
        this.name = name;
        this.address = address;
        this.computer = computer;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone(); // shallow copy
    }

    public void showDetails() {
        System.out.println(enrollId + " , " + name + " , " + " , " + address.city + " , " + computer.sysNo + " , " + computer.brand);
    }

    public static void main(String[] args) throws CloneNotSupportedException {

        Address address = new Address();
        address.city = "Hyd";
        Computer computer = new Computer();
        computer.brand = "lenovo";
        computer.sysNo = 101;

        CloneMethodProblem cm = new CloneMethodProblem(101, "Noorain", address, computer);
        cm.showDetails();

        // now we will clone
        CloneMethodProblem cm1 = (CloneMethodProblem) cm.clone();
        cm1.showDetails();
        System.out.println(cm.hashCode() == cm1.hashCode());

        System.out.println("after changing states using cm1 : lets see the effect on cm");
        cm1.address.city = "Dubai";
        cm1.computer.brand = "hp";
        cm1.computer.sysNo = 102;
        cm.showDetails();
        cm1.showDetails();

//        CloneMethodProblem c2 = new CloneMethodProblem(10, "lenovo");
//        CloneMethodProblem c3 = (CloneMethodProblem) c2.clone();

    }
}

