package com.kurumi.codeThoughts.栈与队列._01_有效括号;

import java.util.Stack;

/**
 * @Author kurumi
 * @Date 2026-07-03 上午11:52:20
 * @Description 20. 有效的括号
 */
public class LeetCode_0020 {
    static class Solution {
        public boolean isValid(String s) {
            if (s.length() % 2 != 0)
                return false;
            Stack<Character> stack = new Stack<>();
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '(')
                    stack.push(')');
                else if (s.charAt(i) == '[')
                    stack.push(']');
                else if (s.charAt(i) == '{')
                    stack.push('}');
                else if (stack.empty() || stack.peek() != s.charAt(i))
                    return false;
                else
                    stack.pop();
            }
            return stack.empty();
        }
    }
}
