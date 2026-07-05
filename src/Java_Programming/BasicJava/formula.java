import java.util.Scanner;


// area of circle

//public class formula {
//    public static void main(String args[]){
//        Scanner sc = new Scanner(System.in);
//        float radius = sc.nextFloat();
//        float AreaOfCircle = radius * radius * 3.14f;
//        float Circumference = 2 * 3.14 * radius;
//        System.out.println(AreaOfCircle);
//        System.out.println(Circumference);
//    }
//}


//area of square

//public class formula {
//    public static void main(String args[]){
//        Scanner sc = new Scanner(System.in);
//        float side = sc.nextFloat();
//        float AreaOfSquare = side * side;
//        System.out.println(AreaOfSquare);
//    }
//}

//area of rectangle

//public class formula {
//    public static void main(String args[]){
//        Scanner sc = new Scanner(System.in);
//        float length = sc.nextFloat();
//        float width = sc.nextFloat();
//        float AreaOfRectangle = 2 * (length * width);
//        System.out.println(AreaOfRectangle);
//    }
//}

//public class formula {
//    public static void main(String args[]){
//        Scanner sc = new Scanner(System.in);
//        float radius = sc.nextFloat();
//        float AreaOfCircle = radius * radius * 3.14f;
//        System.out.println(AreaOfCircle);
//    }
//}

// area of cylinder
public class formula {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        float radius = sc.nextFloat();
        float height = sc.nextFloat();
//        float circumference = radius * radius * 3.14f;
        float TotalSurfaceAreaofCylinder = 2 * 3.14f * radius *(radius + height);
        System.out.println(TotalSurfaceAreaofCylinder);
    }
}