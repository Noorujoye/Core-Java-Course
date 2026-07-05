public class reverse {
    public static void main(String[] args){
        int n = 10899;
        while(n>0){
            int last_digit = n % 10;
            System.out.print(last_digit);
            n = n / 10;
        }
        System.out.println();

//        using for loop

//        for(int i = 0; n >  i; i++){
//            int last = n % 10;
//            System.out.print(last);
//            n = n / 10;
//        }
//        System.out.println();

    }
}
