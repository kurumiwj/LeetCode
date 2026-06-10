package com.kurumi.leetCode.贪心;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 * @Author Administrator
 * @Date 2026年6月10日 21:32:03
 * @Description 3684. 至多 K 个不同元素的最大和
 */
public class LeetCode_3684 {
    private static int[] maxKDistinct1(int[] nums, int k) {
        Set<Integer> set = new TreeSet<>((a, b) -> b - a);
        for (int num : nums) {
            set.add(num);
        }
        int index = 0;
        List<Integer> res = new ArrayList<>();
        for (int num : set) {
            if (num == 0) break;
            res.add(num);
            ++index;
            if (index == k) break;
        }
        return res.stream().mapToInt(Integer::intValue).toArray();
    }

    private static int[] maxKDistinct2(int[] nums, int k) {
        Arrays.sort(nums);
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i == 0 || nums[i] != nums[i-1]) nums[index++] = nums[i];
        }
        k = Math.min(k, index);
        int[] res = new int[k];
        for (int i = 0; i < k; i++) {
            res[i] = nums[index-1-i];
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(maxKDistinct2(new int[]{84, 93, 100, 77, 90}, 3)));
        System.out.println(Arrays.toString(maxKDistinct2(new int[]{84, 93, 100, 77, 93}, 3)));
        System.out.println(Arrays.toString(maxKDistinct2(new int[]{1, 1, 1, 2, 2, 2}, 6)));
    }
}
