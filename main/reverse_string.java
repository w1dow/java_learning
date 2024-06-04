/**
 * reverse_string
 */
public class reverse_string {

    static char[]  reverse(char [] s) {
        int i = 0;
        int j = s.length - 1;
        while (i<j) {
            char t = s[i];
            s[i] = s[j];
            s[j] = t;
            i++;
            j--;
        }
        return s;
    }

    public static void main(String[] args) {
        char a[] = { 'h','i','o','j' };
    System.err.println(reverse(a));
    }
}