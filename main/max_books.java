public class max_books {
    static long max_Books(int arr[], int n, int k) {
        int l = 0;
        int r = 0;
        long ans = 0;
        for (; l < n; l++) {
            if (arr[l] <= k) {
                r = l;
                int sum = 0;
                while (r<n && arr[r] <= k) {
                    sum += arr[r];
                    r++;
                }
                ans =Math.max(ans, sum);
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        long a = max_Books(new int[] {12 ,16, 0 ,19 ,2 ,19 ,19 ,15 ,10 ,7}, 10, 7);
        System.err.println(a);
    }
}
