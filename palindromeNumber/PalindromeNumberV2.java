/*
 * @lc app=leetcode id=9 lang=java
 *
 * [9] Palindrome Number
 */

// @lc code=start
import java.lang.Math;

class Solution {
    public boolean isPalindrome(int x) {
        if (x == 0) {
            return true;
        }
        if (x < 0) {
            return false;
        }
        int len = (int) Math.log10(x) + 1;
        int split = len / 2;
        int rev = 0;
        int coff = x;
        int splitVal = len % 2 == 0 ? x / (int) Math.pow(10, split) : x / (int) Math.pow(10, split + 1);
        for (int i = split; i > 0; i--) {
            int rem = coff % 10;
            rev = rem * (int) Math.pow(10, i - 1) + rev;
            coff = coff / 10;
        }
        return splitVal == rev;
    }
}

public class PalindromeNumberV2 {
    public static void main(String[] args) {
        boolean b = new Solution().isPalindrome(123321);
        System.out.println(b);

    }
}
// @lc code=end
