public class contains_duplicate {
    /*
     * Given an integer array nums and an integer k, return true if there are two
     * distinct indices i and j in the array such that nums[i] == nums[j] and abs(i
     * - j) <= k.
     * 
     * 
     * 
     * Example 1:
     * 
     * Input: nums = [1,2,3,1], k = 3
     * Output: true
     * Example 2:
     * 
     * Input: nums = [1,0,1,1], k = 1
     * Output: true
     * Example 3:
     * 
     * Input: nums = [1,2,3,1,2,3], k = 2
     * Output: false
     */
    static boolean contains_Duplicate(int arr[],int k) {
        for (int i = 0; i < arr.length;i++) {
            for (int j = i+1; j <= (i + k); j++) {
                // System.out.print(arr[i] + " " + arr[j]);
                if (arr[i] == arr[j]) {
                    return true;
                }
            }
            // System.out.println();
        }
        return false;
    }
    public static void main(String[] args) {
        // System.out.println(contains_Duplicate(new int[] { 99,99},2));
        System.err.println(1^1^2);
    }
}
