import java.util.Arrays;

public class arr_deletion {
    
    static int del(int arr[], int index) {
        int elem = arr[index];
        for (int i = index; i < arr.length-1; i++) {
            arr[i] = arr[i + 1];
        }
        return elem;

    }
    public static void main(String[] args) {
        int arr[] = { 1, 12,45,36,19,0,9,8,0 };
        System.err.println(Arrays.toString(arr));
        // System.err.println(del(arr, 6));
        System.err.println(Arrays.toString(arr));
    }
}
