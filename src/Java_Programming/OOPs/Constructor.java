package  OOPS;

public class Constructor{
    static void mymethod() {
        System.out.println("Static method not required objects to get access");
    }
    static  class pen{
        int size;
        String color;
        pen(){
            this.color="green";
            System.out.println(this.color);
        }
        pen(int size){
            this.size = size;
            System.out.println("size of pen is :" + this.size);
        }

    }
    static public class Main {
        int x;  // Create a class attribute

        // Create a class constructor for the Main class
        public Main() {
            x = 5;// Set the initial value for the class attribute x
            System.out.println(x);

        }
    }
    public static void main(String[] args){
              mymethod();
              pen p1 = new pen();
              pen p2 = new pen(9);
              Main myObj = new Main(); // Create an object of class Main (This will call the constructor)
//              System.out.println(myObj.x); // Print the value of x
    }
}