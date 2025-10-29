class Student {
    private int age;
    private String name;
    static String school_name;

    static
    {
        school_name = "Adarsh Academy";
    }

    // we use contructor to connect with jdbc

    public Student(int age , String name) {
        this.age = age; // Initializing age to 0
        this.name = name;

         // Initializing name to "Noorain"
        // This constructor initializes the instance variables with default values
        // Default constructor
        System.out.println("Default constructor called");
        System.out.println("Age: " + age + ", Name: " + name + ", school: " + school_name);
    }

    public void setAge(int age) {
        this.age = age;
    }
    public int getAge() {
        return age;
    }
    public void setName(String name) {
        // name = name; this will create confusion btw the instance and local variable so it will return 0
        this.name = name; // if we want to use same name then we have to use "this" keyword.
        // this keyword refers to the current obj , means no need to make new obj
    }
    public String getName() {
        return name;
    }
}

public class Encapsul {
    public static void main(String[] args) {
        Student obj = new Student(30,"Noorain");
        Student obj1 = new Student(30,"Mahin");
        Student obj2 = new Student(30,"FZiroj");

        // obj.setName("Noorain");
        // obj.setAge(10);
        // System.out.println(obj.getName() + " : " + obj.getAge());
    }
}
