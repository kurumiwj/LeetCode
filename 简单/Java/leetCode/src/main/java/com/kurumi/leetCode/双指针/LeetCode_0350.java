/**
 * @Author: kurumiwj
 * @Date: 2024-10-20 13:07:02
 * @Description: 350. 两个数组的交集 II
 */
package com.kurumi.leetCode.双指针;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class LeetCode_0350 {
    public int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> res = new ArrayList<>();
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int p1 = 0, p2 = 0;
        while (p1 < nums1.length && p2 < nums2.length) {
            if (nums1[p1] == nums2[p2]) {
                res.add(nums1[p1]);
                ++p1;
                ++p2;
            } else if (nums1[p1] < nums2[p2])
                ++p1;
            else
                ++p2;
        }
        return IntStream.range(0, res.size()).map(index -> res.get(index)).toArray();
    }
    public static void main(String[] args) {
        LeetCode_0350 test = new LeetCode_0350();
        System.out.println(Arrays.toString(test.intersect(new int[]{1, 2, 2, 1}, new int[]{2, 2})));
    }
}
