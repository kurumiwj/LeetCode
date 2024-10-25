package com.kurumi.leetCode.贪心;

import java.util.Arrays;

/**
 * @Author kurumi
 * @Date 2024-10-25 下午11:56:13
 * @Description 1710. 卡车上的最大单元数
 */
public class LeetCode_1710 {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        // 二维数组按第二个元素排序
        Arrays.sort(boxTypes, (a, b) -> -Integer.compare(a[1], b[1]));
        int size = 0, weight = 0;
        for (int i = 0; i < boxTypes.length; ++i) {
            // 加上第i个箱子重量未超重
            if (size + boxTypes[i][0] <= truckSize) {
                size += boxTypes[i][0];
                weight += boxTypes[i][1] * boxTypes[i][0];
                if (size == truckSize) break;
            } else {
                // 超重
                weight += boxTypes[i][1] * (truckSize - size);
                break;
            }
        }
        return weight;
    }
}
