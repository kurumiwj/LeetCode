package com.kurumi.scientificPractice.slideWindow.fixedLength.other;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author kurumi
 * @Date 2026-06-25 上午10:02:25
 * @Description 2200. 找出数组中的所有 K 近邻下标
 */
public class LeetCode_2200 {
    private static List<Integer> findKDistantIndices(int[] nums, int key, int k) {
        List<Integer> res = new ArrayList<>();
        int lastKIndex = Integer.MIN_VALUE;
        for (int i = k - 1; i >= 0; --i)
            if (nums[i] == key) {
                lastKIndex = i;
                break;
            }
        for (int i = 0; i < nums.length; i++) {
            if (i + k < nums.length && nums[i + k] == key) {
                lastKIndex = i + k;
            }
            if (lastKIndex >= i - k) res.add(i);
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(findKDistantIndices(new int[] {3,4,9,1,3,9,5}, 9, 1));
        System.out.println(findKDistantIndices(new int[] {2,2,2,2,2}, 2, 2));
        System.out.println(findKDistantIndices(new int[] {1}, 1, 1));
    }
}
