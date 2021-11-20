/*
 * @lc app=leetcode id=13 lang=java
 *
 * [13] Roman to Integer
 */

// @lc code=start
class Solution {
    public int romanToInt(String s) {
        char[] str = s.toCharArray();
        int sum = 0;
        int pval = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = str[i];
            int val = 0;
            switch (c) {
            case 'I':
                val = 1;
                break;
            case 'V':
                val = 5;
                break;
            case 'X':
                val = 10;
                break;
            case 'L':
                val = 50;
                break;
            case 'C':
                val = 100;
                break;
            case 'D':
                val = 500;
                break;
            case 'M':
                val = 1000;
                break;
            }
            sum += val;
            // valid roman numeral cases always match this condition, for example IC is invalid
            if (pval < val) {
                sum -= 2 * pval;
            }
            pval = val;
        }
        return sum;

    }
}

// @lc code=end
