import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * p_020624
 */
public class p_020624 {


    public static ArrayList<Integer> constructList(int q, int[][] queries) {
        ArrayList<Integer> ans = new ArrayList<Integer>();
        ans.add(0);
        for (int a[] : queries) {
            if (a[0] == 0) {
                ans.add(a[1]);
            } else {
                for (int i = 0; i < ans.size(); i++) {
                    int val = ans.get(i) ^ a[1];
                    ans.set(i, val);
                }
            }
        }
        Collections.sort(ans);
        return ans;
    }


    public static void main(String[] args) {
        // int q = 5;
        int q = 3;
        // int queries[] [] = { { 0, 6 }, { 0, 3 }, { 0, 2 }, { 1, 4 }, { 1, 5 } };
        int queries[] [] = { { 0, 2 }, { 1, 3 }, { 0, 5 } };
        System.err.println(constructList(q, queries));
    }
}