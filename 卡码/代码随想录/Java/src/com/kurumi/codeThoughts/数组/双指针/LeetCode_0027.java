package com.kurumi.codeThoughts.数组.双指针;

/**
 * @Author kurumi
 * @Date 2026-07-01 下午10:59:43
 * @Description 27. 移除元素
 */
public class LeetCode_0027 {
    static class Solution {
        public int removeElement(int[] nums, int val) {
            int slow = 0, fast = 0;
            for (fast = 0; fast < nums.length; fast++) {
                if (nums[fast] != val)
                    nums[slow++] = nums[fast];
            }
            return slow;
        }
    }

    public static void main(String[] args) {
        int[] nums = new int[] { 0, 1, 2, 2, 3, 0, 4, 2 };
        Solution solution = new Solution();
        System.out.println(solution.removeElement(nums, 2));
    }
}