import java.util.Arrays;

public class linear_search {

    static int lienar(int arr[], int elem) {
        for (int i = 0; i < arr.length; i++) {
            if (elem == arr[i]) {
                return i;
            }
        }
        return -9999;
    }

    static int binary(int arr[], int elem) {
        int l = 0, h = arr.length - 1, m = (h + l) / 2;
        // Arrays.sort(arr);
        if (arr[0] == elem) {
            return 0;
        }
        while (arr[m] != elem) {
            if (elem > arr[m]) {
                l = m;
                m = (h + l) / 2;
            }
            if (elem < arr[m]) {
                h = m;
                m = (h + l) / 2;
            }
        }
        return m;
    }

    public static void main(String[] args) {
        int[] arr = { 96, 33, 89, 15, 48, 77, 3, 24, 4, 50, 16, 89, 54, 74, 65, 6,
        59, 62, 45, 92, 34, 55, 39, 48, 69,
        93, 3, 98, 3, 92, 82, 72, 36, 93, 44, 4, 1, 53, 89, 40, 60, 26, 48, 35, 29,
        0, 89, 63 };

        // int ans = binary(arr, 15); // needs a sorted array
        // int ans = lienar(arr, 101);
        // System.out.println(ans);
    }
}
