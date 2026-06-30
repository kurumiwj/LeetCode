package com.kurumi.scientificPractice.slideWindow.variableLength.other;

/**
 * @Author kurumi
 * @Date 2026-06-25 下午4:28:36
 * @Description 2904. 最短且字典序最小的美丽子字符串
 */
public class LeetCode_2904 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.shortestBeautifulSubstring1("100011001", 3));
        System.out.println(solution.shortestBeautifulSubstring1("000", 1));
    }
}

class Solution {
    public String shortestBeautifulSubstring(String s, int k) {
        if (s.replace("0", "").length() < k) return "";
        char[] chs = s.toCharArray();
        int left = 0, cnt = 0;
        String res = "1".repeat(chs.length + 1);
        for (int right = left; right < chs.length; right++) {
            int rightVal = chs[right];
            if (rightVal == '1') {
                ++cnt;
            }
            while (left < chs.length && (cnt > k || chs[left] == '0')) {
                if (chs[left] == '1') --cnt;
                ++left;
            }
            if (cnt == k) {
                int len = right - left + 1;
                if (len < res.length()) {
                    res = new String(chs, left, len);
                } else if (len == res.length()) {
                    String str = new String(chs, left, len);
                    res = str.compareTo(res) < 0 ? str : res;
                }
            }
//            System.out.println("res: " + res + ", cnt: " + cnt + ", left: " + left + ", right: " + right);
        }
        return res.length() <= chs.length ? res : "";
    }

    public String shortestBeautifulSubstring1(String s, int k) {
        if (s.replace("0", "").length() < k) return "";
        char[] chs = s.toCharArray();
        int left = 0, cnt = 0;
        String res = s;
        for (int right = left; right < chs.length; right++) {
            cnt += chs[right] - '0';
            while (cnt > k || chs[left] == '0') {
                cnt -= chs[left] - '0';
                ++left;
            }
            if (cnt == k) {
                String tmp = s.substring(left, right + 1);
                if (tmp.length() < res.length() || tmp.length() == res.length() && tmp.compareTo(res) < 0) res = tmp;
            }
        }
        return res;
    }
}
