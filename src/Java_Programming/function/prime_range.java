public class prime_range {

    public static void primeInRange(int n){
        for(int i = 0; i <=n; i++){
            if(isPrime(i)){
            }
            System.out.println(i+"");

        }
    }

    public static boolean isPrime(int n){
        if (n == 2){
            return false;
        }
        for (int i = 2; i <=Math.sqrt(n); i++){
            if(i % n == 0){
                return false;
            }

        }
        return true;
    }

    public static void main(String[] args) {
        primeInRange(100);

    }
}






