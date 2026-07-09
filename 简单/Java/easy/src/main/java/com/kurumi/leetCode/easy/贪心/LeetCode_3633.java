package com.kurumi.leetCode.easy.贪心;

/**
 * @Author Administrator
 * @Date 2026年6月9日 22:55:21
 * @Description 3633. 最早完成陆地和水上游乐设施的时间 I
 */
public class LeetCode_3633 {
    private static int earliestFinishTime(int[] landStartTime, int[] landDuration, int[] waterStartTime, int[] waterDuration) {
        // 先陆地再水上
        int landFirstFinish = Integer.MAX_VALUE, waterSecondFinish = Integer.MAX_VALUE;
        for (int i = 0; i < landStartTime.length; ++i) {
            landFirstFinish = Math.min(landFirstFinish, landStartTime[i] + landDuration[i]);
        }
        for (int i = 0; i < waterStartTime.length; ++i) {
            waterSecondFinish = Math.min(waterSecondFinish, Math.max(landFirstFinish, waterStartTime[i]) + waterDuration[i]);
        }
        // 先水上再陆地
        int waterFirstFinish = Integer.MAX_VALUE, landSecondFinish = Integer.MAX_VALUE;
        for (int i = 0; i < waterStartTime.length; ++i) {
            waterFirstFinish = Math.min(waterFirstFinish, waterStartTime[i] + waterDuration[i]);
        }
        for (int i = 0; i < landStartTime.length; ++i) {
            landSecondFinish = Math.min(landSecondFinish, Math.max(waterFirstFinish, landStartTime[i]) + landDuration[i]);
        }
        return Math.min(landSecondFinish, waterSecondFinish);
    }

    public static void main(String[] args) {
        System.out.println(earliestFinishTime(new int[]{2, 8}, new int[]{4, 1}, new int[]{6}, new int[]{3}));
        System.out.println(earliestFinishTime(new int[]{5}, new int[]{3}, new int[]{1}, new int[]{10}));
    }
}
