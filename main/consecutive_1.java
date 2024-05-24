public class consecutive_1 {
    // Given a binary array nums, return the maximum number of consecutive 1's in the array.
    public int findMaxConsecutiveOnes(int[] nums) {
        int ans = 0;
        int count = 0;
        for (int num : nums) {
            if (num == 1) {
                count++;
            } else {
                count = 0;
            }
            ans = (ans > count) ? ans : count;
        }
        return ans;
    }
}
