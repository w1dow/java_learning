/**
 * p_030624
 */
public class p_030624 {

    
    static int ans(String s, String t) {
        int len = 0;
        int j = 0;
        for (int i = 0; i < s.length() && (j < t.length()); i++) {
            if (s.charAt(i) == t.charAt(j)) {
                // System.out.println(t.charAt(j));
                j++;
            }
        }
        len = t.length() - j;
        return len;
    }
    
    static int ans2(int n){
        int a2 = 3;
        int sum = 5;
        int t = 0;
        if (n == 2) {
            return 1;
        }
        if (n == 3) {
            return 3;
        }
        for (int i = 0; i < n - 3; i++) {
            t = sum;
            sum = sum + a2;
            a2 = t;
            System.out.println();
        }
        
        return ((int)Math.pow(2,n))-sum;
    }
    
    
    public static void main(String[] args) {
    System.out.println(ans2(4));    
    }
}