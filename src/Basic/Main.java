package Basic;


import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;

public class Main {

    int age = 20; //instance variable
    String name = "Noor"; //instance variable

     private static String city = "Indore"; //static member or variables
    //when the class loads this city is immediately available , and others like static blocks and main method

    public Main() {

    }
    public Main(int age , String n) {
        System.out.println("Constructor");
        this.age=10;
        this.name="Noorain";
        System.out.printf("My age is %d  years: ",age);
    }

     void sayHello() { //instance method
                       // This means it belongs to an object (an instance of the Main class).
        System.out.println("Hello from instance method");
        System.out.println(city);


    }
    static void say() { //static method
        System.out.println("Hello from static method");
        System.out.println(city); // u can use static members or variables
//        System.out.println(age); u can use instance variable in static method because it belongs to class
    }
    static void say(String n) {
         System.out.println("Hello from static method with one parameter");
         System.out.println("parameter is : " + n);
    }
     static int counter = 11;
    static {
       System.out.println("static block");
       System.out.println(city); // it will work
//        System.out.println(age); it will no work
    }
    public static void main(String[] args) { //static method

        System.out.println(++counter);
        Main m = new Main(); // An object 'm' is created. It now has its own 'age' and 'name'.
        Main m1 = new Main(100,"Virat");
        m.sayHello(); // m is instance of Main,
                     // To call an instance method, you need an object of the class.

        say("C:\"\\Noorain\\\""); // u can directly call like this because u r in the class
        Main.say("Noorain"); // or u can call static method like this also

        SingletonClass singletonInstance = SingletonClass.getInstance();
        singletonInstance.sameInstance();

        //if I will call it again  I will get the same object
   System.out.println();
        try {
            RandomAccessFile ref = new RandomAccessFile("D:\\JAVA\\CORE-JAVA-5\\src\\Basic\\dsaInterView.pdf" , "r");
            ref.seek(1000);
            String line = ref.readLine();
            System.out.println(line);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
//        sc.nextLine();
        System.out.println(n);


        System.out.print("Enter your age: ");
        int age = sc.nextInt(); // Reads the integer, leaves '\n' in buffer

        System.out.print("Enter your name: ");
        String name = sc.nextLine(); // Reads the leftover '\n', returns empty string
        System.out.println("Name: " + name);


        int x = 5;
        int y = 5;


    }
}

//main method directly can't call the void method or non-static method
//because there is no object exist yet
// sayHello(), because an instance method requires an object to operate on.