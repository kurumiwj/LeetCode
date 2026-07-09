package com.kurumi.leetCode.easy.贪心;

import java.util.Arrays;

/**
 * @Author Administrator
 * @Date 2026年6月7日 21:31:42
 * @Description 2224. 转化时间需要的最少操作数
 */
public class LeetCode_2224 {
    private static int convertTime(String current, String correct) {
        int[] currentTime = Arrays.stream(current.split(":")).mapToInt(Integer::parseInt).toArray();
        int[] correctTime = Arrays.stream(correct.split(":")).mapToInt(Integer::parseInt).toArray();
        int interval = correctTime[0] * 60 + correctTime[1] - (currentTime[0] * 60 + currentTime[1]);
        return interval / 60 + interval % 60 / 15 + interval % 60 % 15 / 5 + interval % 60 % 15 % 5;
    }

    public static void main(String[] args) {
        System.out.println(convertTime("02:30", "04:35"));
        System.out.println(convertTime("11:00", "11:01"));
        System.out.println(convertTime("09:41", "10:34"));
    }
}
