package com.kurumi.basicPractice.双指针;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Author kurumi
 * @Date 2026-07-03 下午1:12:34
 * @Description 15. 三数之和
 */
public class LeetCode_0015 {
    static class Solution {
        public List<List<Integer>> threeSum(int[] nums) {
            List<List<Integer>> res = new ArrayList<>();
            int n = nums.length;
            Arrays.sort(nums);
            for (int i = 0; i < n - 2; i++) {
                int num = nums[i];
                // 去重i
                if (i > 0 && num == nums[i - 1]) continue;
                if (num + nums[i + 1] + nums[i + 2] > 0) break;
                if (num + nums[n - 1] + nums[n - 2] < 0) continue;
                int j = i + 1, k = n - 1;
                while (j < k) {
                    int sum = num + nums[j] + nums[k];
                    if (sum > 0) --k;
                    else if (sum < 0) ++j;
                    else {
                        res.add(Arrays.asList(num, nums[j], nums[k]));
                        ++j;
                        // 去重j
                        while (j < k && nums[j] == nums[j - 1]) ++j;
                        --k;
                        // 去重k
                        while (k > j && nums[k + 1] == nums[k]) --k;
                    }
                }
            }
            return res;
        }
    }
}
