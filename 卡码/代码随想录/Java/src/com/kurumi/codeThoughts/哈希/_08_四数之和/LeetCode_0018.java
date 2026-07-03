package com.kurumi.codeThoughts.哈希._08_四数之和;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Author kurumi
 * @Date 2026-07-03 上午11:52:20
 * @Description 18. 四数之和
 */
public class LeetCode_0018 {
    static class Solution {
        public List<List<Integer>> fourSum(int[] nums, int target) {
            List<List<Integer>> res = new ArrayList<>();
            Arrays.sort(nums);
            for (int k = 0; k < nums.length - 3; k++) {
                if (nums[k] > target && nums[k] >= 0)
                    break;
                if (k > 0 && nums[k] == nums[k - 1])
                    continue;
                for (int i = k + 1; i < nums.length - 2; i++) {
                    int n1 = nums[k] + nums[i];
                    if (n1 > target && nums[i] >= 0)
                        break;
                    if (i > k + 1 && nums[i] == nums[i - 1])
                        continue;
                    int left = i + 1, right = nums.length - 1;
                    while (left < right) {
                        int n2 = nums[left], n3 = nums[right];
                        if (n1 + n2 + n3 == target) {
                            res.add(Arrays.asList(nums[k], nums[i], n2, n3));
                            while (left < right && nums[left] == n2)
                                left++;
                            while (left < right && nums[right] == n3)
                                right--;
                        } else if (n1 + n2 + n3 < target)
                            left++;
                        else
                            right--;
                    }
                }
            }
            return res;
        }
    }
}
