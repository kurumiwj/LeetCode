package com.kurumi.codeThoughts.栈与队列._03_逆波兰表达式;

import java.util.Stack;

/**
 * @Author kurumi
 * @Date 2026-07-03 上午11:52:20
 * @Description 150. 逆波兰表达式求值
 */
public class LeetCode_0150 {
    static class Solution {
        public int evalRPN(String[] tokens) {
            Stack<Integer> nums = new Stack<>();
            Integer num1 = 0, num2 = 0;
            for (String token : tokens) {
                if ("+".equals(token) || "-".equals(token) || "*".equals(token) || "/".equals(token)) {
                    num2 = nums.pop();
                    num1 = nums.pop();
                }
                switch (token) {
                case "+":
                    nums.push(num1 + num2);
                    break;
                case "-":
                    nums.push(num1 - num2);
                    break;
                case "*":
                    nums.push(num1 * num2);
                    break;
                case "/":
                    nums.push(num1 / num2);
                    break;
                default:
                    nums.push(Integer.parseInt(token));
                }
            }
            return nums.pop();
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String[] tokens = new String[] { "10", "6", "9", "3", "+", "-11", "*", "/", "*", "17", "+", "5", "+" };
        System.out.println(solution.evalRPN(tokens));
    }
}
