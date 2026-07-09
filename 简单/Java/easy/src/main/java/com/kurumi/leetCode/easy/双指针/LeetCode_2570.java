package com.kurumi.leetCode.easy.双指针;

import com.kurumi.leetCode.easy.utils.ArrayUtils;
import java.util.Arrays;

/**
 * @Author Administrator
 * @Date 2026年6月12日 22:53:25
 * @Description 2570. 合并两个二维数组 - 求和法
 */
public class LeetCode_2570 {
    private static int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        int[][] res = new int[nums1.length + nums2.length][2];
        int i = 0, j = 0, index = 0;
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i][0] == nums2[j][0]) {
                res[index] = new int[]{nums1[i][0], nums1[i][1] + nums2[j][1]};
                ++i;
                ++j;
            }
            else if (nums1[i][0] < nums2[j][0]) {
                res[index] = nums1[i++];
            } else {
                res[index] = nums2[j++];
            }
            ++index;
        }
        while (i < nums1.length) res[index++] = nums1[i++];
        while (j < nums2.length) res[index++] = nums2[j++];
        return Arrays.copyOfRange(res, 0, index);
    }

    public static void main(String[] args) {
        ArrayUtils.print(mergeArrays(new int[][]{{1, 2}, {2, 3}, {4, 5}}, new int[][]{{1, 4}, {3, 2}, {4, 1}}));
        ArrayUtils.print(mergeArrays(new int[][]{{2, 4}, {3, 6}, {5, 5}}, new int[][]{{1, 3}, {4, 3}}));
    }
}
