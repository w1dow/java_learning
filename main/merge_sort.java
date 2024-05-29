import java.util.*;

/**
 * merge_sort algorithm
 */
public class merge_sort {

    static int[] merge(int a[], int b[]) {
        int c[] = new int[a.length + b.length];
        int i = 0, j = 0, k = 0;
        while (i < a.length && j < b.length) {
            if (a[i] < b[j]) {
                c[k] = a[i];
                i++;
            } else {
                c[k] = b[j];
                j++;
            }
            k++;
        }
        while (i < a.length) {
            c[k] = a[i];
            i++;
            k++;
        }
        while (j < b.length) {
            c[k] = b[j];
            k++;
            j++;
        }
        return c;
    }


    static int[] sort(int a[]) {
        int c[] = a.clone();
        return c;
}
    public static void main(String args[]){
        System.err.println("Hello world");
        int a1[]= new int[]{1,4,7,10,22,24,68,77,100};
        int a2[]= new int[]{0,2,5,11,20};
        int ans[] = merge(a1, a2);
        System.err.println(Arrays.toString(ans));
    }
}