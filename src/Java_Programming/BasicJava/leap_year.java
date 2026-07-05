import java.util.Scanner;

public class leap_year {
    public static void main(String[] args) {
        System.out.println("Check whether the year is leap or not");
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter year");
        int year = sc.nextInt();

        if(year / 4 == 0){
            System.out.println(year + " is Leap year.");
        }
        else if(year / 100 == 0){
            System.out.println(year + " is leap year.");
        }
        else {
            System.out.println(year + " is not a leap year.");
        }

    }
}
