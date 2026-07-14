package com.kurumi.leetCode.easy.模运算;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author kurumi
 * @Date 2026年7月14日 11:21:08
 * @Description 1018. 可被 5 整除的二进制前缀
 */
public class LeetCode_1018 {
    static class Solution {
        public List<Boolean> prefixesDivBy5(int[] nums) {
            int mod = 0;
            List<Boolean> res = new ArrayList<>();
            for (int num : nums) {
                mod = (mod * 2 + num) % 5;
                res.add(mod == 0);
            }
            return res;
        }
    }

    static class Solution1 {
        public List<Boolean> prefixesDivBy5(int[] nums) {
            int mod = 0;
            List<Boolean> res = new ArrayList<>();
            for (int num : nums) {
                mod = (mod << 1 | num) % 5;
                res.add(mod == 0);
            }
            return res;
        }
    }
}
