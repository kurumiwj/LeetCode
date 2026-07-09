package com.kurumi.leetCode.easy.贪心;

/**
 * @Author Administrator
 * @Date 2026年6月7日 22:25:44
 * @Description 2383. 赢得比赛需要的最少训练时长
 */
public class LeetCode_2383 {
    private static int minNumberOfHours(int initialEnergy, int initialExperience, int[] energy, int[] experience) {
        int res = 0, totalEnergy = 1, curExperience = initialExperience;
        for (int i = 0; i < energy.length; i++) {
            totalEnergy += energy[i];
            if (curExperience <= experience[i]) {
                res += experience[i] + 1 - curExperience;
                curExperience = 2 * experience[i] + 1;
            } else {
                curExperience += experience[i];
            }
        }
        if (initialEnergy < totalEnergy) res += totalEnergy - initialEnergy;
        return res;
    }

    public static void main(String[] args) {
        System.out.println(minNumberOfHours(5, 3, new int[]{1, 4, 3, 2}, new int[]{2, 6, 3, 1}));
        System.out.println(minNumberOfHours(2, 4, new int[]{1}, new int[]{3}));
        System.out.println(minNumberOfHours(100, 100, new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9}, new int[]{1, 2, 3, 1, 2, 3, 1, 2, 10}));
    }
}
