package com.kurumi.leetCode.easy.贪心;

/**
 * @Author Administrator
 * @Date 2026年6月7日 21:05:11
 * @Description 2078. 两栋颜色不同且距离最远的房子
 */
public class LeetCode_2078 {
    private static int maxDistance(int[] colors) {
        int res = 0;
        for (int i = 0; i < colors.length; i++) {
            if (colors.length - 1 - i <= res) break;
            for (int j = colors.length - 1; j > i; j--) {
                if (j - i <= res) break;
                if (colors[i] != colors[j]) {
                    res = Math.max(j - i, res);
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] colors = {1, 1, 1, 6, 1, 1, 1};
        System.out.println(maxDistance(colors));
        int[] colors1 = {1, 8, 3, 8, 3};
        System.out.println(maxDistance(colors1));
        int[] colors2 = {0, 1};
        System.out.println(maxDistance(colors2));
    }
}
