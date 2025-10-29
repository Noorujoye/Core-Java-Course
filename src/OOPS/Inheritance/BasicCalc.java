package OOPS.Inheritance;

public class BasicCalc {
    public static void main(String[] args) {

        // Here calc class has two methods add , sub
        /*Calc obj = new Calc();
        obj.add(2,3);
        obj.sub(8,3);*/

        // Here, I want a calc which can perform all the task so
        // i will make a advcalc but i again have to write all the methods
        // so to  avoid writing i will inherit the methods in advcalc from calc

        AdvCalc opr = new AdvCalc();
        float r1 = opr.div(10,20);
        int r2 = opr.mul(2,5);
        int r3 = opr.add(10,20);
        int r4 = opr.sub(10,5);
        System.out.println(r1+" "+r2+" "+r3+" "+r4);

        // ok this is good but think if there is two different classes with same method name
        // And you are calling a method from object of 3rd class
        // it will confuse so there is no multiple inheritance in java
        // so confusion is ambiguity

    }
}
