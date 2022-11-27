package com.saikishore;

import java.util.Arrays;

public class TwoSum {
    static class Solution {
        public int[] twoSum(int[] nums, int target) {
            for (int i = 0; i < nums.length; i++) {
                for (int j = i + 1; j < nums.length; j++) {
                    if (nums[j] == target - nums[i]) {
                        return new int[] { i, j };
                    }
                }
            }
            // In case there is no solution, we'll just return null
            return null;
        }
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] nums = {1,2,3};
        int target = 5;
        int[] result = sol.twoSum(nums , target);
        System.out.println(Arrays.toString(result));

    }
}
