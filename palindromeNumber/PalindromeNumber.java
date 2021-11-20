/*
 * @lc app=leetcode id=9 lang=java
 *
 * [9] Palindrome Number
 */

// @lc code=start
import java.lang.Math;

class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0)
            return false;
        if (x < 10)
            return true;
        int len = (int) Math.log10(x);
        int leftRem = x, rightCoff = x;
        boolean ans = false;
        for (int i = 0; i <= len; i++) {
            int powl = (int) Math.pow(10, (len - i));
            int leftCoff = leftRem / powl;
            leftRem = leftRem % powl;
            int rightRem = rightCoff % 10;
            rightCoff = rightCoff / 10;
            if (leftCoff != rightRem) {
                return false;
            }
            ans = true;
        }
        return ans;
    }
}


// @lc code=end
