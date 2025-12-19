package OOPS;

public class PassByValueAndReferences {
    String name = "Noorain";
    int age = 10;
     {
        System.out.println("Static block: " + name);
     }
    public  void passByValue(String name) {
        System.out.println("pass by value : " + name);
        System.out.println(name);
        name = name; // if i used this keyword then the instance will get
        // change and if not then only inside the method the change will occur

        System.out.println("pass by value : " + name);
    }

    public void passByValue(PassByValueAndReferences obj2) {
         System.out.println(age); // local variable will get printed , which is 10
        System.out.println("Initial value of object 2 :" + obj2.name);
        obj2.age=200;
        System.out.println("Value change of object 2 : " + obj2.age);
        age = 300;
        System.out.println("Value will not get change of object 2 : " + obj2.age);
        System.out.println("value will get change for the local variable inside the method only : " + age);


        System.out.println();
    }
    public static void main(String[] args) {
//        PassByValueAndReferences.passByValue("Noorain");
        PassByValueAndReferences obj1 = new PassByValueAndReferences();
        PassByValueAndReferences obj2 = new PassByValueAndReferences();
        obj1.passByValue("shama");
        System.out.println(obj1.name);

        int age = 10;
        obj1.passByValue(obj2);
    }
}

