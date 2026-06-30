package com.kurumi.scientificPractice.slideWindow.fixedLength.advanced;

/**
 * @Author kurumi
 * @Date 2026-06-23 下午4:21:04
 * @Description 3439. 重新安排会议得到最多空余时间 I
 */
public class LeetCode_3439 {
    public int maxFreeTime(int eventTime, int k, int[] startTime, int[] endTime) {
        int n = startTime.length;
        int[] free = new int[n + 1];
        free[0] = startTime[0];
        for (int i = 1; i < n; ++i) {
            free[i] = startTime[i] - endTime[i-1];
        }
        free[n] = eventTime - endTime[n-1];
        int res = 0, sum = 0;
        for (int i = 0; i <= n; ++i) {
            sum += free[i];
            if (i < k) continue;
            res = Math.max(res, sum);
            sum -= free[i-k];
        }
        return res;
    }
}
