package OOPs;

import java.util.Scanner;

public class Copy_object {

    int roll;
    String name;

    Copy_object(String name, int roll) {
        this.name = name;
        this.roll = roll;
    }

    Copy_object(Copy_object c) {
        this.name = c.name;
        this.roll = c.roll;
    }

    void getData() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name : ");
        name = sc.nextLine();

        System.out.println("Enter the roll no : ");
        roll = sc.nextInt();
    }

    void showData() {
        System.out.println("Name is " + name + " and roll no is " + roll);
    }

    public static void main(String[] args) {
        Copy_object c1 = new Copy_object("", 0);
        c1.getData();

        Copy_object c2 = new Copy_object(c1);

        c1.showData();
        c2.showData();
    }
}
