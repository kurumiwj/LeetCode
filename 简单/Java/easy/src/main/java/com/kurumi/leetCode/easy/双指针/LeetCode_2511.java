package com.kurumi.leetCode.easy.双指针;

/**
 * @Author Administrator
 * @Date 2026年6月12日 21:58:31
 * @Description 2511. 最多可以摧毁的敌人城堡数目
 */
public class LeetCode_2511 {
    private static int captureForts(int[] forts) {
        int i = 0, cnt = 0, n = forts.length;
        while (i < n && forts[i] == 0) ++i;  // 找到第一个不为0作为起点
        if (i >= n) return 0;
        while (i < n) {
            int tmpCnt = 0, j = i + 1;
            while (j < n) {
                if (forts[j] == 0) ++tmpCnt;
                else {
                    if (forts[i] + forts[j] == 0) cnt = Math.max(cnt, tmpCnt);
                    i = j;
                    break;
                }
                ++j;
            }
            if (j >= n) break;
        }
        return cnt;
    }

    public static void main(String[] args) {
        System.out.println(captureForts(new int[]{1, 0, 0, -1, 0, 0, 0, 0, 1}));
        System.out.println(captureForts(new int[]{0, 0, 1, -1}));
        System.out.println(captureForts(new int[]{0, -1, -1, 0, -1}));
        System.out.println(captureForts(new int[]{-1, 0, -1, 0, 1, 1, 1, -1, -1, -1}));
        System.out.println(captureForts(new int[]{-1, -1, 0, 1, 0, 0, 1, -1, 1, 0}));
        System.out.println(captureForts(new int[]{0}));
    }
}
