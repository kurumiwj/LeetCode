package com.kurumi.scientificPractice.slideWindow.fixedLength.basic;

/**
 * @Author kurumi
 * @Date 2026-06-22 下午10:21:43
 * @Description 1423. 可获得的最大点数
 */
public class LeetCode_1423 {
    private static int maxScore(int[] cardPoints, int k) {
        int n = cardPoints.length, left = 0, right = 0, sum = 0;
        while (right < n - k) {
            sum += cardPoints[right++];
        }
        int total = sum, minSum = sum;
        while (right < n) {
            total += cardPoints[right];
            sum -= cardPoints[left];
            sum += cardPoints[right];
            minSum = Math.min(minSum, sum);
            ++left;
            ++right;
        }
        return total - minSum;
    }

    public static void main(String[] args) {
        System.out.println(maxScore(new int[] {9,7,7,9,7,7,9}, 7));
        System.out.println(maxScore(new int[] {1,2,3,4,5,6,1}, 3));
    }
}
