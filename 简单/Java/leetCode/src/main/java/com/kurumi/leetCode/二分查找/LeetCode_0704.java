package com.kurumi.leetCode.二分查找;

/**
 * @Author kurumi
 * @Date 2026-06-14 下午3:02:37
 * @Description 704. 二分查找
 */
public class LeetCode_0704 {
    public int search(int[] nums, int target) {
        int left=0,right=nums.length-1;
        while(left<=right) {
            int middle=(left+right)/2;
            if(nums[middle]==target) return middle;
            else if(target<nums[middle]) right=middle-1;
            else left=middle+1;
        }
        return -1;
    }
}
