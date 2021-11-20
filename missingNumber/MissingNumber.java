/*
 * @lc app=leetcode id=268 lang=java
 *
 * [268] Missing Number
 */

// @lc code=start
class Solution {
    public int missingNumber(int[] nums) {
        int actualSum = 0, expectedSum = 0;
        for (int i = nums.length; i >= 0; i--) {
            expectedSum += i;
        }
        for (int i : nums) {
            actualSum += i;
        }
        return expectedSum - actualSum;
    }
}
// @lc code=end
