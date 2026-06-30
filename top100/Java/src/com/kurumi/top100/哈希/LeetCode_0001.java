package com.kurumi.top100.哈希;

import java.util.HashMap;

/**
 * @Author kurumi
 * @Date 2026-06-30 下午5:46:16
 * @Description 1. 两数之和
 */
public class LeetCode_0001 {
    static class Solution {
        public int[] twoSum(int[] nums, int target) {
            HashMap<Integer, Integer> map = new HashMap<Integer,Integer>();
            for(int i=0;i<nums.length;i++) {
                if(map.containsKey(target-nums[i])) return new int[] {map.get(target-nums[i]),i};
                else map.put(nums[i],i);
            }
            return new int[]{};
        }
    }
}
