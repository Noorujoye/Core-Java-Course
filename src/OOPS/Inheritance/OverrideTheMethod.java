package OOPS.Inheritance;
//import Inheritance.AdvCalc;

public class OverrideTheMethod {
    public int add(int x, int y) {
        return x + y;
    }
}
class Override2 extends OverrideTheMethod {
    public int add(int x , int y){
        return x*y;
    }
    public static void main(String[] args) {
        Override2 obj = new Override2();
        int r1 = obj.add(10,10);
        System.out.println(r1);
    }
}
