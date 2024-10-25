package com.kurumi.leetCode.双指针;

/**
 * @Author kurumi
 * @Date 2024年10月25日 下午11:24:52
 * @Description 832. 翻转图像
 */
public class LeetCode_0832 {
    public int[][] flipAndInvertImage(int[][] image) {
        for (int i = 0; i < image.length; ++i) {
            int left = 0, right = image[i].length - 1;
            while (left <= right) {
                // 左右两个元素相等则都反转, 不等则不变
                if (image[i][left] == image[i][right]) {
                    if (image[i][left] == 0) {
                        image[i][left] = 1;
                        image[i][right] = 1;
                    } else {
                        image[i][left] = 0;
                        image[i][right] = 0;
                    }
                }
                ++left;
                --right;
            }
        }
        return image;
    }
}
