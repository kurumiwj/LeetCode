/**
 * @Author: kurumiwj
 * @Date: 2024-10-20 18:01:40
 * @Description: 605. 种花问题
 */
package com.kurumi.leetCode.贪心;

public class LeetCode_0605 {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        for (int i = 0; i < flowerbed.length; ++i) {
            // 若当前位置种花则跳过下一个
            if ((i == 0 || flowerbed[i-1] == 0) && flowerbed[i] == 0 && (i == flowerbed.length-1 || flowerbed[i+1] == 0)) {
                ++i;
                --n;
            }
        }
        return n <= 0;
    }
}
