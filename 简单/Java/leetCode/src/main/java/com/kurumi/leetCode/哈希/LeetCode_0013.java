// 13. 罗马数字转整数
package com.kurumi.leetCode.字符串;

import java.util.HashMap;

public class LeetCode_0013 {
    public int romanToInt(String s) {
        HashMap<Character, Integer> hash = new HashMap<>();
        hash.put('I', 1);
        hash.put('V', 5);
        hash.put('X', 10);
        hash.put('L', 50);
        hash.put('C', 100);
        hash.put('D', 500);
        hash.put('M', 1000);
        int res = 0;
        char[] nums = s.toCharArray();
        for (int i = 0; i < nums.length - 1; i++) {
            res += hash.get(nums[i]) >= hash.get(nums[i+1]) ? hash.get(nums[i]) : -hash.get(nums[i]);
        }
        return res + hash.get(nums[nums.length - 1]);
    }
    public static void main(String[] args) {
        LeetCode_0013 test = new LeetCode_0013();
        System.out.println(test.romanToInt("MCMXCIV"));
    }
}
