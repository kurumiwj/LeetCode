package com.kurumi.leetCode.双指针;

import java.util.Arrays;

/**
 * @Author Administrator
 * @Date 2026年6月11日 20:46:02
 * @Description 1089. 复写零
 */
public class LeetCode_1089 {
    private static void duplicateZeros(int[] arr) {
        int index = 0;
        while (index < arr.length) {
            if (arr[index] == 0) {
                for (int i = arr.length - 1; i > index; i--) {
                    arr[i] = arr[i-1];
                }
                index += 2;
            } else ++index;
        }
    }

    // 双指针
    private static void duplicateZeros2(int[] arr) {
        int slow = 0, fast = 0;
        while (fast < arr.length) {
            if (arr[slow] != 0) {
                ++slow;
                ++fast;
            } else {
                fast += 2;
                ++slow;
            }
        }
        System.out.println("slow: %d, fast: %d".formatted(slow, fast));
        --slow;
        int index = arr.length - 1;
        for (int i = slow; i >= 0; i--) {
            if (i == slow && arr[i] == 0 && fast == arr.length + 1) {
                arr[index] = 0;
            } else {
                if (arr[i] != 0) {
                    arr[index] = arr[i];
                } else {
                    arr[index--] = 0;
                    if (index < 0) {
                        break;
                    }
                    arr[index] = 0;
                }
            }
            --index;
        }
    }

    public static void main(String[] args) {
        int[] nums = {1, 0, 2, 3, 0, 4, 5, 0};
        duplicateZeros2(nums);
        System.out.println(Arrays.toString(nums));
        nums = new int[]{1, 2, 3};
        duplicateZeros2(nums);
        System.out.println(Arrays.toString(nums));
        nums = new int[]{0, 0, 0, 0, 0, 0, 0};
        duplicateZeros2(nums);
        System.out.println(Arrays.toString(nums));
        nums = new int[]{8, 4, 5, 0, 0, 0, 0, 7};
        duplicateZeros2(nums);
        System.out.println(Arrays.toString(nums));
    }
}
