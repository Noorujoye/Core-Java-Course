package Modifiers.A;

public class Prot1 extends Prot {
    public static void main(String[] args) {
        Prot p = new Prot();
        System.out.println(p.name);

        Prot1 p1 = new Prot1();
        System.out.println(p1.name);
    }
}
