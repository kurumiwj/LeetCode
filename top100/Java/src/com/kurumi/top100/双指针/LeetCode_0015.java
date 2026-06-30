package com.kurumi.top100.双指针;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Author kurumi
 * @Date 2026-06-30 下午5:49:34
 * @Description 15. 三数之和
 */
public class LeetCode_0015 {
    static class Solution {
        public List<List<Integer>> threeSum(int[] nums) {
            List<List<Integer>> res = new ArrayList<>();
            Arrays.sort(nums);
            for(int i=0;i<nums.length-2;i++) {
                int n1=nums[i];
                if(n1>0) break;
                if(i>0&&nums[i]==nums[i-1]) continue;
                int left=i+1,right=nums.length-1;
                while(left<right) {
                    int n2=nums[left],n3=nums[right];
                    if(n1+n2+n3==0) {
                        res.add(Arrays.asList(n1,n2,n3));
                        while(left<right&&nums[left]==n2) left++;
                        while(left<right&&nums[right]==n3) right--;
                    }else if(n1+n2+n3<0) left++;
                    else right--;
                }
            }
            return res;
        }
    }
}
