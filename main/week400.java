import java.util.Arrays;

/**
 * week400
 */
public class week400 {

    static int minchair(String s) {
        int c = 0; // count of total number of people currently in the room
        int max = 0; // count of maximum number of people in the room so far.
        for (char x : s.toCharArray()) {
            if (x == 'E')
                c++;
            else
                c--;
            max = (max > c) ? max : c;
        }

        return max;
    }

    static int counDays(int days, int[][] meetings) {
        int a[] = new int[days + 1];
        int ans = 0;
        for (int m[] : meetings) {
            for (int x = m[0]; x <= m[1]; x++) {
                a[x] = 1;
            }
        }
        for (int z : a) {
            if (z == 0)
                ans++;
        }
        return --ans;
    }

    static String clearStars(String s) {
        String ans = "";
        int a[] = new int[s.length()];
        int index = 0;
        char c ='z';
        for (int i = 0; i < s.length(); i++) {
            if ((s.charAt(i) <= c) && s.charAt(i) != '*') {
                index = i;
                c = s.charAt(i);
            }
            System.err.println(index);
            if (s.charAt(i) == '*') {
                a[index] = 1;
                a[i] = 1;
            }
        }
        System.err.println(Arrays.toString(a));
        for (int i = 0; i < s.length(); i++) {
            if(a[i]==0){
                ans+=s.charAt(i);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        // System.err.println(minchair("ELEELEELLL")); // 1
        int mee[][]={{5,7},{1,3},{9,10}};
        // int mee[][] = { { 1,6 } };
        // System.out.println(counDays(10, mee));
        // Arrays.sort(mee);
        // System.err.println(Arrays.toString(mee));
        System.err.println(clearStars("d*o*"));
        // System.err.println('a'<'b');
}
}