// 26. 删除有序数组中的重复项
package com.kurumi.leetCode.双指针;

/**
 * @author: kurumi
 * @date: 2024-10-16 22:17:54
 */
public class LeetCode_0026 {
    public int removeDuplicates(int[] nums) {
        switch (nums.length) {
            case 0:
                return 0;
            case 1:
                return 1;
            default:
                int slow = 1, fast = 1;
                while (fast < nums.length) {
                    if (nums[fast] != nums[fast - 1]) {
                        nums[slow] = nums[fast];
                        slow++;
                    }
                    fast++;
                }
                return slow;
        }
    }
}
