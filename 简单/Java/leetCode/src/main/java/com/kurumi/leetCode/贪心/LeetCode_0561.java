/**
 * @Author: kurumiwj
 * @Date: 2024-10-20 17:59:18
 * @Description: 561. 数组拆分
 */
package com.kurumi.leetCode.贪心;

import java.util.Arrays;

public class LeetCode_0561 {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int res = 0;
        for (int i = 0; i < nums.length; i += 2) {
            res += nums[i];
        }
        return res;
    }
}
