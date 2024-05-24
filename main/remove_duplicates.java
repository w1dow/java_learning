import java.util.*;
public class remove_duplicates {
    public static void main(String[] args) {
        int a[] = { 1, 2, 2, 2, 3, 3, 3, 4, 4, 4, 4,6 };
        int i = 0;
        int val = a[0];
        int j = 1;
        while (i < a.length) {
            if (a[i] != val) {
                val = a[i];
                a[j] = val;
                j++;
            }
            i++;
        }
        for (i = 0; i < j; i++) {
            System.out.println(a[i]);
        }
    }


}
