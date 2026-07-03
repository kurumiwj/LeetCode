package com.kurumi.codeThoughts.栈与队列._05_前K个高频元素;

import java.util.Arrays;
import java.util.HashMap;
import java.util.PriorityQueue;

/**
 * @Author kurumi
 * @Date 2026-07-03 上午11:52:20
 * @Description 347. 前K个高频元素
 */
public class LeetCode_0347 {
    static class Solution {
        // 小顶堆
        public int[] topKFrequent(int[] nums, int k) {
            HashMap<Integer, Integer> map = new HashMap<>();
            for (int num : nums)
                map.put(num, map.getOrDefault(num, 0) + 1);
            PriorityQueue<int[]> q = new PriorityQueue<>((pair1, pair2) -> pair1[1] - pair2[1]);
            for (HashMap.Entry<Integer, Integer> entry : map.entrySet()) {
                q.add(new int[] { entry.getKey(), entry.getValue() });
                // 如果小顶堆元素大于k个则弹出
                if (q.size() > k)
                    q.poll();
            }
            int[] res = new int[k];
            for (int i = k - 1; i >= 0; i--)
                res[i] = q.poll()[0];
            return res;
        }
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int[] nums = { 1, 1, 1, 2, 2, 3 };
        int k = 2;
        System.out.println(Arrays.toString(s.topKFrequent(nums, k)));
    }
}
