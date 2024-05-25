import java.util.HashMap;

public class majority_element {
    static public int major(int[] nums) {
        HashMap<Integer, Integer> n = new HashMap<Integer, Integer>();
        for (int a : nums) {
            if (n.containsKey(a)) {
                n.put(a, n.get(a) + 1);
            } else {
                n.put(a, 1);
            }
        }
        
        int ans = 0;
        int f = 0;
        for (int s : nums) {
            if (f < n.get(s)) {
                ans = s;
                f = n.get(s);
            }
        }
        // System.out.println(n);
        // System.out.println(ans);
        return ans;
    }
    public static void main(String[] args) {
        int a[] = { 2,2,1,1,1,2,2};
        // HashMap<Integer, Integer> n = new HashMap<Integer, Integer>();
        // n.put(1,0);
        // n.put(2,0);
        // n.put(3, 0);
        // if (n.containsKey(3)) {
        //     System.out.println(n.get(3));
        //     n.put(3, n.get(3) + 1);
        // }
        // System.err.println(n);
        // System.err.println(n.containsKey(4));
        major(a);



        ///SOLUTION-2
        /*
         * if the element occurs more than n/2 times , in a  sorted array it will always occupy the n/2th position
         */
    }
}
