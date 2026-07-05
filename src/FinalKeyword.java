public class FinalKeyword {
    final int pancard;
    final String name;


    public FinalKeyword(int pancard, String name) {
        this.pancard = pancard;
        this.name = name;
//        System.out.println(name + " " + pancard);
    }

    final public String showName() {
        return name + pancard;//System.out.println(name + " " + pancard);
    }

    public static void main(String[] args) {
        FinalKeyword f = new FinalKeyword(101, "virat");
        f = new FinalKeyword(102, "noorain");
        System.out.println(f.showName());
        ;

//        final String pancard; // = "";
//        pancard = "Noorain";
//        final int age;
//        age = 21;
////        System.out.println(pancard = "noor");
////        System.out.println(age = 10);
    }
}
