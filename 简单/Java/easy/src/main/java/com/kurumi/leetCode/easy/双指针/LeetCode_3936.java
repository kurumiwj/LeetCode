package com.kurumi.leetCode.easy.双指针;

/**
 * @Author Administrator
 * @Date 2026年6月13日 17:46:56
 * @Description 3936. 将 0 移到末尾的最少交换次数
 */
public class LeetCode_3936 {
    public int minimumSwaps(int[] nums) {
        int i = 0, j = nums.length - 1, cnt = 0;
        while (j >= 0 && nums[j] == 0) --j;
        while (i < nums.length && nums[i] != 0) ++i;
        while (i < j) {
            if (nums[i] == 0) {
                nums[i] = nums[j];
                nums[j] = 0;
                ++cnt;
                while (j >= 0 && nums[j] == 0) --j;
                if (j < 0) break;
            }
            ++i;
        }
        return cnt;
    }
}
