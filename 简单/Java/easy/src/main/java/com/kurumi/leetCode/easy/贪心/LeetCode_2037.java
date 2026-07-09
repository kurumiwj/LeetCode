package com.kurumi.leetCode.easy.贪心;

import java.util.Arrays;

/**
 * @Author Administrator
 * @Date 2026年6月7日 20:54:23
 * @Description 2037. 使每位学生都有座位的最少移动次数
 */
public class LeetCode_2037 {
    private static int minMovesToSeat(int[] seats, int[] students) {
        int res = 0;
        Arrays.sort(seats);
        Arrays.sort(students);
        for (int i = 0; i < seats.length; i++) {
            res += Math.abs(seats[i] - students[i]);
        }
        return res;
    }

    public static void main(String[] args) {
        int[] seats = {3, 1, 5};
        int[] students = {2, 7, 4};
        System.out.println(minMovesToSeat(seats, students));
        int[] seats1 = {4, 1, 5, 9};
        int[] students1 = {1, 3, 2, 6};
        System.out.println(minMovesToSeat(seats1, students1));
    }
}
