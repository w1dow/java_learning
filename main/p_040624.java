import java.util.HashMap;
import java.util.Map;

/**
 * p_040624
 */
public class p_040624 {


    static int ans(String s) {
        if (s.length() ==1) {
            return 0;
        }
        int ans = 0;
        HashMap<Character, Integer> a = new HashMap<Character, Integer>();
        for (int i = 0; i < s.length(); i++) {
            char x = s.charAt(i);
            if (a.containsKey(x)) {
                a.put(x, a.get(x) + 1);
            } else {
                a.put(x, 1);
            }
        }
        int c = 0;
        for (Map.Entry<Character, Integer> z : a.entrySet()) {

            if (z.getValue() % 2 == 0) {
                ans += z.getValue();
            } else {
                c++;
            }
        }
        if (c >1) {
            ans = ans + c-1;
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(ans("MOMd"));
    }
}