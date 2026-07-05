package OOPs.Inheritance;

public class single {
    public static void main(String[] args) {
        Father f = new Father();
        f.surname("warsi");

        Son s = new Son();
        s.surname("warsi");
        s.hobbies();

    }
}
class Father {
    protected String surname;
    void surname(String surname){
        this.surname = surname;
    }
    void eats(){
        System.out.println("love to eat");
    }
}

class Son extends Father {
    int age;
    void hobbies() {
        System.out.println("Cricket");
        System.out.println("I'm Noorain Warsi "+surname);
    }
}

class Mother {
    Mother(String name) {
        System.out.println("Father's constructor: " + name);
    }
}

class daughter extends Mother {
    daughter(String name) {
        super(name); // calling Father's constructor
        System.out.println("Son is created");
    }
}


