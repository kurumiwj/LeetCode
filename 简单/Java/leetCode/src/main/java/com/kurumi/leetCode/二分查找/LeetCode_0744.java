package com.kurumi.leetCode.二分查找;

/**
 * @Author kurumi
 * @Date 2026-06-14 下午3:03:12
 * @Description 744. 寻找比目标字母大的最小字母
 */
public class LeetCode_0744 {
    public char nextGreatestLetter(char[] letters, char target) {
        int i = 0, j = letters.length - 1;
        while (i <= j) {
            int mid = (i + j) / 2;
            if (letters[mid] <= target) i = mid + 1;
            else j = mid - 1;
        }
        return i < letters.length ? letters[i] : letters[0];
    }
}
