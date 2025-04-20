package com.kurumi.leetCode.动态规划;

/**
 * @Author kurumi
 * @Date 2025/04/20 14:20
 * @Description 1668. 最大重复子字符串
 */
public class LeetCode_1668 {
    public int maxRepeating(String sequence, String word) {
        int k = 0;
        while (sequence.contains(word.repeat(k + 1))) {
            ++k;
        }
        return k;
    }

    public static void main(String[] args) {
        String sequence = "aaabaaaabaaabaaaabaaaabaaaabaaaaba";
        String word = "aaaba";
        LeetCode_1668 test = new LeetCode_1668();
        System.out.println(test.maxRepeating(sequence, word));
    }
}
