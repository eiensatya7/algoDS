/*
 * @lc app=leetcode id=1 lang=java
 *
 * [1] Two Sum
 */

// @lc code=start
class Solution {

    public int[] twoSum(int[] nums, int target) {
        int len = nums.length;
        for (int i = 0; i < len; i++) {
            int pivot = nums[i];
            int wanted = target - pivot;
            for (int j = i+1; j < len ; j++) {
                if (nums[j] == wanted) {
                    return new int[] { i, j };
                }
            }
        }
        return null;
    }
}

// @lc code=end
