package recursion;

public class TillingProblem {
    public static int titlingProblem(int n) {// 2 * n

        //base case
        if (n == 0 || n == 1) return 1;
        //work
        //vertical choice
        int verticalTiles = titlingProblem(n-1);
        //horizontal choices
        int horizontalTiles = titlingProblem(n-2);
        int totalWays = verticalTiles+horizontalTiles;
        return totalWays;
    }
    public static void main(String[] args) {
        int n = titlingProblem(4);
        System.out.println(n);

    }
}
