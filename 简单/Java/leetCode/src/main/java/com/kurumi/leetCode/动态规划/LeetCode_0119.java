// 119. 杨辉三角 II
package com.kurumi.leetCode.动态规划;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author: kurumi
 * @date: 2024-10-16 21:08:44
 */
public class LeetCode_0119 {
    public List<Integer> getRow(int rowIndex) {
        int[] res = new int[rowIndex + 1];
        res[0] = 1;
        // 第i项的计算只与上一行第i−1项及第i项有关, 倒着动态规划
        for (int i = 1; i <= rowIndex; i++) {
            for (int j = i; j > 0; j--) {
                res[j] += res[j - 1];
            }
        }
        return Arrays.stream(res).boxed().collect(Collectors.toList());
    }
    public static void main(String[] args) {
        LeetCode_0119 test = new LeetCode_0119();
        test.getRow(3).forEach(System.out::println);
    }
}
