package com.kurumi.codeThoughts.单调栈;

import java.util.Stack;

/**
 * @Author kurumi
 * @Date 2026-07-03 上午11:52:20
 * @Description LeetCode_0739
 */
public class LeetCode_0739 {
    static class Solution {
        public int[] dailyTemperatures(int[] temperatures) {
            int[] res = new int[temperatures.length];
            Stack<Integer> st = new Stack<>();
            for (int i = 0; i < temperatures.length; i++) {
                while (!st.empty() && temperatures[i] > temperatures[st.peek()]) {
                    res[st.peek()] = i - st.peek();
                    st.pop();
                }
                st.push(i);
            }
            return res;
        }
    }
}
