package com.kurumi.leetCode.easy.双指针;

/**
 * @Author Administrator
 * @Date 2026年6月12日 20:53:47
 * @Description 2367. 等差三元组的数目
 */
public class LeetCode_2367 {
    private static int arithmeticTriplets(int[] nums, int diff) {
        int i = 0, j = 1, cnt = 0;
        while (i < j && j < nums.length) {
            if (nums[j] - nums[i] < diff) ++j;
            else if (nums[j] - nums[i] > diff) {
                ++i;
                j = i + 1;
            }
            else {
                for (int k = j + 1; k < nums.length; k++) {
                    if (nums[k] - nums[j] == diff) {
                        ++cnt;
                        break;
                    }
                }
                ++i;
                j = i + 1;
            }
        }
        return cnt;
    }

    public static void main(String[] args) {
        System.out.println(arithmeticTriplets(new int[]{0, 1, 4, 6, 7, 10}, 3));
        System.out.println(arithmeticTriplets(new int[]{4, 5, 6, 7, 8, 9}, 2));
        System.out.println(arithmeticTriplets(new int[]{6, 14, 15, 26, 31, 36, 38, 41, 42, 45}, 5));
    }
}
