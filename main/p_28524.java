/**
 * p_28524
 */
public class p_28524 {

    public static int minimumCost(int n, int w, int[] cost) {
        int c = cost[w];
        int j = 0;
        for (int i = 1; (i < n); i++) {
             j = w - i;
             if (((cost[i] + cost[j]) < c) && cost[i] > 0 && cost[j] > 0) {
                 System.out.println(i + " " + j);
                 System.out.println(cost[i] + " " + cost[j]);
                c = cost[i] + cost[j];
                // System.err.println(c);
            }
        }
        return c;
    }
    public static void main(String[] args) {      //0,   1 ,  2,  3,   4  ,5  ,6
        int x = minimumCost(5, 5, new int[] { -1,20, 10, -1, 50, 100,10 } );
        System.err.println(x);
    }
}