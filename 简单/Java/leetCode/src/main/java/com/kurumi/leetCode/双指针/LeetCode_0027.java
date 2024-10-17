// 27. 移除元素
package com.kurumi.leetCode.双指针;

/**
 * @author: kurumi
 * @date: 2024-10-16 22:06:25
 */
public class LeetCode_0027 {
    public int removeElement(int[] nums, int val) {
        int slow = 0, fast = 0;
        for (fast = 0; fast < nums.length; fast++) {
            if (nums[fast] != val) {
                nums[slow++] = nums[fast];
            }
        }
        return slow;
    }
}
