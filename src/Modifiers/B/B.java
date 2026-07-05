package Modifiers.B;

import Modifiers.A.Prot;

public class B extends Prot {
    private int b = 10;

    public static void main(String[] args) {
        Prot p = new Prot();
        System.out.println(p.name);
    }
}
