package com.kurumi.leetCode.scientificPractice.滑动窗口.不定长.basic;

/**
 * @Author kurumi
 * @Date 2026-06-24 下午9:39:32
 * @Description 2024. 考试的最大困扰度
 */
public class LeetCode_2024 {
    private static int maxConsecutiveAnswers(String answerKey, int k) {
        char[] chs = answerKey.toCharArray();
        int n = chs.length, left = 0, cnt = 0, res = 0;
        // F -> T
        for (int right = left; right < n; ++right) {
            if (chs[right] == 'F') {
                while (cnt == k) {
                    if (chs[left] == 'F') --cnt;
                    ++left;
                }
                ++cnt;
            }
            res = Math.max(res, right - left + 1);
        }
        left = 0;
        cnt = 0;
        // T -> F
        for (int right = left; right < n; ++right) {
            if (chs[right] == 'T') {
                while (cnt == k) {
                    if (chs[left] == 'T') --cnt;
                    ++left;
                }
                ++cnt;
            }
            res = Math.max(res, right - left + 1);
        }
        return res;
    }

    private static int maxConsecutiveAnswers1(String answerKey, int k) {
        char[] chs = answerKey.toCharArray();
        int n = chs.length, left = 0, res = 0;
        int[] cnt = new int[2];
        for (int right = left; right < n; ++right) {
            ++cnt[chs[right] >> 1 & 1];
            while (cnt[0] > k && cnt[1] > k) {
                --cnt[chs[left] >> 1 & 1];
                ++left;
            }
            res = Math.max(res, right - left + 1);
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(maxConsecutiveAnswers1("TTFF", 2));
        System.out.println(maxConsecutiveAnswers1("TFFT", 1));
        System.out.println(maxConsecutiveAnswers1("TTFTTFTT", 1));
    }
}
