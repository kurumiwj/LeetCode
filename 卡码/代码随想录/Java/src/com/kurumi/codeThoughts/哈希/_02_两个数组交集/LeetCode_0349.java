package com.kurumi.codeThoughts.哈希._02_两个数组交集;

import java.util.HashSet;

/**
 * @Author kurumi
 * @Date 2026-07-03 上午11:52:20
 * @Description 349. 两个数组的交集
 */
public class LeetCode_0349 {
    static class Solution {
        public int[] intersection(int[] nums1, int[] nums2) {
            HashSet<Integer> hash = new HashSet<Integer>();
            HashSet<Integer> res = new HashSet<Integer>();
            for (int num : nums1)
                hash.add(num);
            for (int num : nums2)
                if (hash.contains(num))
                    res.add(num);
            return res.stream().mapToInt(num -> num).toArray();
        }
    }
}
