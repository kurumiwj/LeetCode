package com.kurumi.leetCode.排序;

import java.util.Arrays;

/**
 * @Author kurumi
 * @Date 2024年11月3日 下午1:01:28
 * @Description 888. 公平的糖果交换
 */
public class LeetCode_0888 {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int[] res = new int[2];
        Arrays.sort(aliceSizes);
        Arrays.sort(bobSizes);
        int aliceSum = Arrays.stream(aliceSizes).sum();
        int bobSum = Arrays.stream(bobSizes).sum();
        int sub = (Math.max(aliceSum, bobSum) - Math.min(aliceSum, bobSum)) / 2;
        if (aliceSum > bobSum) {
            handle(aliceSizes, bobSizes, res, sub);
        } else {
            handle(bobSizes, aliceSizes, res, sub);
            res[0] ^= res[1];
            res[1] ^= res[0];
            res[0] ^= res[1];
        }
        return res;
    }
    
    private void handle(int[] maxArr, int[] minArr, int[] res, int sub) {
        for (int i = 0, j = 0; i < maxArr.length && j < minArr.length;) {
            int tmp = maxArr[i] - minArr[j];
            if (tmp == sub) {
                res[0] = maxArr[i];
                res[1] = minArr[j];
                break;
            } else {
                if (tmp > sub) {    // maxArr数量大于minArr
                    ++j;
                } else {    // maxArr数量小于minArr
                    ++i;
                }
            }
        }
    }
}
