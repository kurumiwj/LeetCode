// 118. 杨辉三角
package com.kurumi.leetCode.数组;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author: kurumi
 * @date: 2024-10-16 20:07:34
 **/
public class LeetCode_0118 {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();
        res.add(new ArrayList(Arrays.asList(1)));
        if (numRows == 1) return res;
        else {
            for (int row = 1; row < numRows; row++) {
                int col = row + 1;
                List<Integer> tmp = new ArrayList();
                for (int j = 0; j < col; j++) {
                    // 若是第一个或最后一个则数字为1
                    if (j == 0 || j == col - 1) {
                        tmp.add(1);
                        continue;
                    }
                    // 上一行相邻两个元素之和
                    tmp.add(res.get(row - 1).get(j-1) + res.get(row - 1).get(j));
                }
                res.add(tmp);
            }
        }
        return res;
    }
    public static void main(String[] args) {
        LeetCode_0118 test = new LeetCode_0118();
        test.generate(5).forEach(arr -> {
            arr.forEach(num -> System.out.print(num + " "));
            System.out.println();
        });
    }
}
