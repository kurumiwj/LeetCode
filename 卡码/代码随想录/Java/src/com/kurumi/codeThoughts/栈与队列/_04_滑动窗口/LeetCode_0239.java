package com.kurumi.codeThoughts.栈与队列._04_滑动窗口;

import java.util.LinkedList;

/**
 * @Author kurumi
 * @Date 2026-07-03 上午11:52:20
 * @Description 239. 滑动窗口最大值
 */
public class LeetCode_0239 {
    static class Solution {
        public int[] maxSlidingWindow(int[] nums, int k) {
            int index = 0;
            int[] res = new int[nums.length + 1 - k];
            Window window = new Window();
            for (int i = 0; i < k; i++)
                window.push(nums[i]);
            res[index++] = window.front();
            for (int i = k; i < nums.length; i++) {
                window.pop(nums[i - k]);
                window.push(nums[i]);
                res[index++] = window.front();
            }
            return res;
        }
    }
}

class Window {
    LinkedList<Integer> queue = null;

    public Window() {
        queue = new LinkedList<>();
    }

    public void push(int val) {
        while (!queue.isEmpty() && val > queue.getLast())
            queue.removeLast();
        queue.add(val);
    }

    public void pop(int val) {
        if (!this.queue.isEmpty() && val == this.front())
            this.queue.poll();
    }

    public int front() {
        return queue.peek();
    }
}
