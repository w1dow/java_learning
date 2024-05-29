import java.util.Arrays;

public class max_frequency {

    static int[] find_frequency(int[] nums) {
        Arrays.sort(nums);
        if (nums.length < 2) {
            return nums;
        }
        int t, j;
        // System.out.println(Arrays.toString(nums));
        for (int i = 0; i < nums.length;) {
            t = nums[i];
            int count = 1;
            for (j = i + 1; j < nums.length; j++) {
                if (nums[j] != t) {
                    break;
                }
                nums[j] = 0;
                count++;
            }
            nums[i] = count;
            i = j;
        }
        return nums;
    }

    static int maxFrequencyElements(int[] nums) {
        int[] ans = find_frequency(nums);
        if (nums.length < 2) {
            return 1;
        }
        Arrays.sort(ans);
        int a = 0;
      for(int n:ans){
          if (n == ans[ans.length - 1]) {
              a += n;
        }
      }
        return a;
    }

    public static void main(String[] args) {
        int c[] = { 1, 2,2,3,4,5 };
        int k = maxFrequencyElements(c);
        System.err.println(k);
    }
}
