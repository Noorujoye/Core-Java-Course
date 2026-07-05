package Pattern;

public class inverted_rotated {
    public static void inverted(int row, int col){
        for(int i = 1; i<=row; i++){
            for (int j = 1; j <=row-i; j++){
                System.out.print(" ");
            }
            //stars
            for (int j =1; j <=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
      public static void main(String[] args){
        inverted(4,4);

          }
}
