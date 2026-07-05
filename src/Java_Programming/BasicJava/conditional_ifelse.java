import java.util.Scanner;

public class conditional_ifelse {
    public static void main(String[] args) {
//       if else : if parts condition is get true then block
//       of code will run otherwise else part will get executed

      Scanner sc = new Scanner(System.in);
//        while(true) {
//            System.out.println("Enter the Age : ");
//            int Age = sc.nextInt();
//
//            if (Age == -1) {  // Condition to stop the loop
//                System.out.println("Exiting the program...");
//                break;
//            }
//
//            if (Age >= 18 && Age <= 60 ){
//                System.out.println("Adult");
//            } else if (Age <= 18 && Age > 13) {
//                System.out.println("teen");
//
//            } else if (Age > 60) {
//                System.out.println("budhha hai tu");
//            } else {
//                System.out.println("child");
//            }
//        }
//        sc.close();


        System.out.println("enter vslue of a : ");
        int a = sc.nextInt();


        System.out.println("Enter value of b : ");
        int b = sc.nextInt();
        if ( a>=b){
            System.out.println("A  is larger thann b");
        }
        else {
            System.out.println("B  is larger than B");
        }

    }
}
