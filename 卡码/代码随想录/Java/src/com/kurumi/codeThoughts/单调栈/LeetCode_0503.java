package com.kurumi.codeThoughts.单调栈;

import java.util.Arrays;
import java.util.Stack;

/**
 * @Author kurumi
 * @Date 2026-07-03 上午11:52:20
 * @Description 503. 下一个更大元素 II
 */
public class LeetCode_0503 {
    static class Solution {
        public int[] nextGreaterElements(int[] nums) {
            int[] res = new int[nums.length];
            Arrays.fill(res, -1);
            Stack<Integer> st = new Stack<>();
            for (int i = 0; i < nums.length * 2; i++) {
                while (!st.empty() && nums[i % nums.length] > nums[st.peek()]) {
                    res[st.peek()] = nums[i % nums.length];
                    st.pop();
                }
                st.push(i % nums.length);
            }
            return res;
        }
    }
}
