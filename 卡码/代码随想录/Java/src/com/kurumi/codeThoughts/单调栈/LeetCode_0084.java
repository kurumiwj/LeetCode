package com.kurumi.codeThoughts.单调栈;

import java.util.LinkedList;

/**
 * @Author kurumi
 * @Date 2026-07-03 上午11:52:20
 * @Description 84. 柱状图中最大的矩形
 */
public class LeetCode_0084 {
    static class Solution {
        public int largestRectangleArea(int[] heights) {
            int[] newHeights = new int[heights.length + 2];
            newHeights[0] = 0;
            newHeights[newHeights.length - 1] = 0;
            for (int i = 0; i < heights.length; i++)
                newHeights[i + 1] = heights[i];
            LinkedList<Integer> st = new LinkedList<>();
            int res = 0;
            st.push(0);
            for (int i = 1; i < newHeights.length; i++) {
                System.out.println(st.peek());
                if (newHeights[i] == newHeights[st.peek()])
                    st.pop();
                else {
                    while (newHeights[i] < newHeights[st.peek()]) {
                        int mid = st.pop();
                        if (!st.isEmpty()) {
                            int w = i - st.peek() - 1;
                            int h = newHeights[mid];
                            res = Math.max(res, w * h);
                        }
                    }
                }
                st.push(i);
            }
            return res;
        }
    }
}
