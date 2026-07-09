package com.kurumi.leetCode.easy.双指针;

/**
 * @Author Administrator
 * @Date 2026年6月10日 22:41:21
 * @Description 922. 按奇偶排序数组 II
 */
public class LeetCode_0922 {
    public int[] sortArrayByParityII(int[] nums) {
        int n = nums.length, odd = 1;
        for (int even = 0; even < n; even += 2) {
            if ((nums[even] & 1) == 1) {    // 偶数索引为奇数
                while ((nums[odd] & 1) == 1) {
                    odd += 2; // 奇数索引为奇数
                }
                nums[even] ^= nums[odd];
                nums[odd] ^= nums[even];
                nums[even] ^= nums[odd];
            }
        }
        return nums;
    }

    // 双指针
    private int[] sortArrayByParityII2(int[] nums) {
        int odd = 1, even = 0;
        while (odd < nums.length && even < nums.length) {
            while (odd % 2 == nums[odd] % 2) {
                odd += 2;
                if (odd >= nums.length) break;
            }
            while (even % 2 == nums[even] % 2) {
                even += 2;
                if (even >= nums.length) break;
            }
            if (odd < nums.length && even < nums.length) {
                int tmp = nums[odd];
                nums[odd] = nums[even];
                nums[even] = tmp;
                odd += 2;
                even += 2;
            }
        }
        return nums;
    }
}
