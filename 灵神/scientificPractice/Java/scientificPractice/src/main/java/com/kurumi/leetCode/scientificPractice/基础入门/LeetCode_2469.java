package com.kurumi.leetCode.scientificPractice.基础入门;

/**
 * @Author kurumi
 * @Date 2026-07-09 16:39:06
 * @Description 2469. 温度转换
 **/
public class LeetCode_2469 {
    class Solution {
        public double[] convertTemperature(double celsius) {
            return new double[]{celsius + 273.15, celsius * 1.8 + 32};
        }
    }
}
