// Given three numbers n, x, and y, Geek and his friend are playing a coin game. In the beginning, there are n coins. 
// In each move, a player can pick x, y, or 1 coin. Geek always starts the game. 
// The player who picks the last coin wins the game. 
// The task is to determine whether Geek will win the game or not if both players play optimally.
/**
 * 29_05_24
 */

 /**
  * 290524
  */
/**
 * p_29524
 */
public class p_29524 {

    static boolean wins(int n, int x, int y) {
        boolean dp[] = new boolean[n + 1];
        dp[0] = false;
        dp[1] = true;
        for (int i = 2; i < dp.length; i++) {
            if (i - 1 >= 0 && dp[i - 1] == false) {
                dp[i] = true;
            }
            else if (i - x >= 0 && dp[i - x] == false) {
                dp[i] = true;
            }
            else if (i - y >= 0 && dp[i - y] == false) {
                dp[i] = true;
            }
        }
        return dp[n];
    }

 public static void main(String[] args) {
    System.err.println(wins(10,6,5));
 }   
}