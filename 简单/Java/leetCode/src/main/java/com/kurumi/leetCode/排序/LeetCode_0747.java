package com.kurumi.leetCode.排序;

/**
 * @Author kurumi
 * @Date 2024年11月3日 下午12:45:27
 * @Description 747. 至少是其他数字两倍的最大数
 */
public class LeetCode_0747 {
    // 排序
//    public int dominantIndex(int[] nums) {
//        int[] nums1 = Arrays.copyOfRange(nums, 0, nums.length);
//        Arrays.sort(nums1);
//        int n = nums1.length;
//        if (nums1[n-1] >= 2 * nums1[n-2]) { // 找到两倍最大数
//            for (int i = 0; i < n; ++i) {
//                if (nums[i] == nums1[n-1]) return i;
//            }
//        }
//        return -1;   // 不存在
//    }
    // 模拟
    public int dominantIndex(int[] nums) {
        int max = -1, secondMax = -1;
        int index = 0;
        for (int i = 0; i < nums.length; ++i) {
            if (nums[i] > max) {
                secondMax = max;
                max = nums[i];
                index = i;
            } else if (nums[i] > secondMax) secondMax = nums[i];
        }
        return max >= 2 * secondMax ? index : -1;
    }
}
