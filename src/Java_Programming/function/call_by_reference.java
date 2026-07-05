package function;

public class call_by_reference {
    public static void swap(int a, int b){
        //code for swap
        int temp = a;
        a = b;
        b = temp;
        System.out.println(a+" "+b);
    }
    static public void main(String[] args){
        //Swap - value exchange
        int a = 10;
        int b = 20;
        swap(a,b);
    }
}
