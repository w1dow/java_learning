// Given an integer array a[] of size n, find the length of the longest subsequence such that the absolute difference between adjacent elements is 1.

// Example 1:

// Input:
// n = 7
// a[] = {10, 9, 4, 5, 4, 8, 6}
// Output: 
// 3
// Explaination: 
// The three possible subsequences of length 3 are {10, 9, 8}, {4, 5, 4}, and {4, 5, 6}, where adjacent elements have a absolute difference of 1. No valid subsequence of greater length could be formed.
// Example 2:

// Input: 
// n = 5
// a[] = {1, 2, 3, 4, 5}
// Output: 
// 5
// Explaination: 
// All the elements can be included in the valid subsequence.

import java.util.*;

/**
 * longest_subsequence
 */
public class longest_subsequence {

    public static int longestSubseq(int n, int[] a) {
        // Arrays.sort(a);
        ArrayList<Integer> sub = new ArrayList<Integer>();
        int max = 0;
        for (int i = 0; i < n; i++) {
            sub.add(a[i]);
            for (int j = 0; j < n; j++) {
               int e = sub.get(sub.size()-1);
               if((Math.abs(a[i]-e)==1)&&(i!=j)){
                   sub.add(a[i]);
               }
            }
            System.out.println(sub);
            sub.clear();
        }
        return 0;
    }

    public static void main(String[] args) {
        longestSubseq(7, new int[] { 10, 9, 4, 5, 4, 8, 6 });
    }
}