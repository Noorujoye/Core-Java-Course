public class main extends AbstractClass implements Inter, Inter1 {
    public void show() {
        System.out.println("noorain is here...");
    }

    @Override
    public void showName() {
        Inter1.super.showName();
        System.out.println("inter1");
    }


    public static void main(String[] args) {
        new main().showName();
    }
}
