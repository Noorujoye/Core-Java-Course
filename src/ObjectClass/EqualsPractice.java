package ObjectClass;

public class EqualsPractice {
    String name1;

    public boolean equals(EqualsPractice s1) {
        if (this.name1.equals(s1.name1)) {
            return true;
        }
        return false;
    }

    EqualsPractice(String name1) {
        this.name1 = name1;
    }

    public static void main(String[] args) {
        EqualsPractice e1 = new EqualsPractice("noor");
        EqualsPractice e2 = new EqualsPractice("noor");

        System.out.println(e1.equals(e2));


    }
}
