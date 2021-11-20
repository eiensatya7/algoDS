/*
 * @lc app=leetcode id=217 lang=java
 *
 * [217] Contains Duplicate
 */


// @lc code=start
class Solution {
    public boolean containsDuplicate(int[] nums) {
        int len = nums.length;
        for (int i = 0; i < len; i++) {
            int ival = nums[i];
            for (int j = i + 1; j < len; j++) {
                int jval = nums[j];
                if (jval == ival) {
                    return true;
                }
            }
        }
        return false;
    }
}
// @lc code=end
