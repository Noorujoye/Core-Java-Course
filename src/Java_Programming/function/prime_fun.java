package function;


public class prime_fun {
    /*
    public static boolean isPrime(int n){
        boolean isPrime = true;
        for (int i = 2; i <=n; i++){
            if(n% i == 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        System.out.println(isPrime(12));
        */
    public static boolean isPrime(int n){
        if(2 == n){
            return false;

        }
        for(int i = 2; i<= Math.sqrt(n); i++){
            if(n% i == 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        System.out.println(isPrime(7));
    }
}
