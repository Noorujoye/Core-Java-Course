public class SIB {
    int x;


    SIB() {
        System.out.println("constructor is called...");
        x += 20;
        System.out.println(x);
    }

    // IIB
    {
        int x = 9;
        System.out.println("Instance Initialization block :" + x);
    }

    // SIB
    static {
        System.out.println("static block"); // this will executes first
        try {
            //System.out.println(x); //cannot access instance variable in static block..
        } catch (Exception e) {
            System.out.println("cannot access instance variable in static block...");
        }
    }

    static void sharedata() {
        System.out.println("i m static method...");
    }

    public static void main(String[] args) {

        sharedata();
        System.out.println("hi");
        new SIB();
        //int ans2 = sharedata();
        //  int ans1 = sharedata();
        //System.out.println(ans2);
        //  System.out.println(ans1);
    }
}
