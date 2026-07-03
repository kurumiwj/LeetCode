// 213. 打家劫舍 II
package main

import (
	"math"
)

func rob0(nums []int, start, end int) int {
	if end-start == 1 {
		return nums[start]
	}
	dp := make([]int, len(nums))
	dp[start] = nums[start]
	if end-start > 1 {
		dp[start+1] = int(math.Max(float64(nums[start]), float64(nums[start+1])))
	}
	for i := start + 2; i < len(nums); i++ {
		dp[i] = int(math.Max(float64(dp[i-1]), float64(dp[i-2]+nums[i])))
	}
	return dp[end-1]
}

func rob(nums []int) int {
	if len(nums) == 1 {
		return nums[0]
	}
	return int(math.Max(float64(rob0(nums, 0, len(nums)-1)), float64(rob0(nums, 1, len(nums)))))
}
