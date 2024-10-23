package com.kurumi.leetCode.贪心;

/**
 * @Author kurumi
 * @Date 2024-10-23 下午11:45:22
 * @Description 860. 柠檬水找零
 */
public class LeetCode_0860 {
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
