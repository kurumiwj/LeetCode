package com.kurumi.leetCode.贪心;

/**
 * @Author kurumi
 * @Date 2024-10-26 下午11:31:14
 * @Description 1736. 替换隐藏数字得到的最晚时间
 */
public class LeetCode_1736 {
    public String maximumTime(String time) {
        char[] timeArr = time.toCharArray();
        for (int i = 0; i < timeArr.length; ++i) {
            if (timeArr[i] == '?') {
                if (i == 0) {
                    if (timeArr[1] < '4' || timeArr[1] == '?') timeArr[i] = '2';
                    else timeArr[i] = '1';
                }
                else if (i == 1) {
                    if (timeArr[0] != '2') timeArr[1] = '9';
                    else timeArr[1] = '3';
                } else if (i == 3) {
                    timeArr[i] = '5';
                } else timeArr[i] = '9';
            }
        }
        return String.valueOf(timeArr);
    }
}
