// 14. 最长公共前缀
package com.kurumi.leetCode.字符串;

/**
 * @author: kurumi
 * @date: 2024-10-16 01:04:28
 **/
public class LeetCode_0014 {
    public String longestCommonPrefix(String[] strs) {
        String prefix = "";
        int index = 0;
        while (true) {
            boolean isFinish = false;   // 是否找到
            if (index >= strs[0].length()) break;   // index超过第一个字符串长度则直接结束
            char ch = strs[0].charAt(index);
            for (int i = 1; i < strs.length; i++) {
                // 若下标已超过字符串长度则结束
                if (index >= strs[i].length() || ch != strs[i].charAt(index)) {
                    isFinish = true;
                    break;
                }
            }
            if (!isFinish) {
                prefix += String.valueOf(ch);
                index++;
            } else break;
        }
        return prefix;
    }

    public static void main(String[] args) {
        LeetCode_0014 test = new LeetCode_0014();
        System.out.println(test.longestCommonPrefix(new String[]{"dog","racecar","car"}));
    }
}
