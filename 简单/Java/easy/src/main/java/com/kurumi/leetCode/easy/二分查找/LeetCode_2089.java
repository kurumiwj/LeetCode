package com.kurumi.leetCode.easy.二分查找;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Author kurumi
 * @Date 2026-06-14 下午10:45:16
 * @Description 2089. 找出数组排序后的目标下标
 */
public class LeetCode_2089 {
    private static List<Integer> targetIndices(int[] nums, int target) {
        List<Integer> list = new ArrayList<>();
        Arrays.sort(nums);
        int i = 0, j = nums.length - 1;
        while (i <= j) {
            int mid = (i + j) / 2;
            if (nums[mid] < target) i = mid + 1;
            else if (nums[mid] > target) j = mid - 1;
            else {
                int start = mid, end = mid;
                while (start >= 0 && nums[start] == target) --start;
                ++start;
                while (end < nums.length && nums[end] == target) ++end;
                --end;
                for (int k = start; k <= end; ++k) {
                    list.add(k);
                }
                break;
            }
        }
        return list;
    }

    public static void main(String[] args) {
        System.out.println(targetIndices(new int[] {1,2,5,2,3}, 2));
    }
}
