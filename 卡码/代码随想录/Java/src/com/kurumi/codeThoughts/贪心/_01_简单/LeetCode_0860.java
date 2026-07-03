package com.kurumi.codeThoughts.贪心._01_简单;

/**
 * @Author kurumi
 * @Date 2026-07-03 上午11:52:20
 * @Description 860. 柠檬水找零
 */
public class LeetCode_0860 {
    static class Solution {
        public boolean lemonadeChange(int[] bills) {
            int five = 0, ten = 0;
            for (int bill : bills) {
                switch (bill) {
                case 5:
                    five++;
                    break;
                case 10:
                    if (five > 0) {
                        five--;
                        ten++;
                    } else
                        return false;
                    break;
                case 20:
                    if (ten > 0 && five > 0) {
                        five--;
                        ten--;
                    } else if (five >= 3) {
                        five -= 3;
                    } else
                        return false;
                }
            }
            return true;
        }
    }
}
