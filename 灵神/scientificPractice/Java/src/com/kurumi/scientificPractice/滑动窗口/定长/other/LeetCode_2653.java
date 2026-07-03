package com.kurumi.scientificPractice.滑动窗口.定长.other;

import java.util.Arrays;

/**
 * @Author kurumi
 * @Date 2026-06-25 下午2:02:03
 * @Description 2653. 滑动子数组的美丽值
 */
public class LeetCode_2653 {
    private static int[] getSubarrayBeauty(int[] nums, int k, int x) {
        int n = nums.length, left = 0, index = 0;
        int[] cnt = new int[105], res = new int[n - k + 1];
        for (int right = left; right < n; right++) {
            ++cnt[nums[right] + 50];
            if (right - left + 1 == k) {
                int tmp = x;
                for (int i = -50; i < 0; i++) {
                    tmp -= cnt[i + 50];
                    if (tmp <= 0) {
                        res[index] = i;
                        break;
                    }
                }
                --cnt[nums[left++] + 50];
                ++index;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(getSubarrayBeauty(new int[] {1,-1,-3,-2,3}, 3, 2)));
        System.out.println(Arrays.toString(getSubarrayBeauty(new int[] {-3,1,2,-3,0,-3}, 2, 1)));
    }
}
