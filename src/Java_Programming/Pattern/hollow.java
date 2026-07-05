package Pattern;

public class hollow {
    public static void hollow_Rectangle(int trow, int tcol){
        // i representing lines
//        outer loop
        for(int i = 1; i <=trow; i++){

            // lines - columns
            for(int j = 1; j<=tcol; j++){
                //cell - (i,j)
                if(i ==1 || i == trow || j ==1 || j == tcol){
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();


        }

    }
      public static void main(String[] args){
              hollow_Rectangle(4,5);


          }
}
