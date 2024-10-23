package com.kurumi.leetCode.贪心;

import java.util.Arrays;

/**
 * @Author kurumi
 * @Date 2024-10-24 上午12:23:32
 * @Description 976. 三角形的最大周长
 */
public class LeetCode_0976 {
    public int largestPerimeter(int[] nums) {
        Arrays.sort(nums);
//        int[] sortedNums = Arrays.stream(nums).boxed().sorted((a, b) -> -Integer.compare(a, b)).mapToInt(Integer::valueOf).toArray();
        for (int i = nums.length-1; i > 1; --i) {
            if (nums[i-1] + nums[i-2] > nums[i]) return nums[i] + nums[i-1] + nums[i-2];
        }
        return 0;
    }
}
