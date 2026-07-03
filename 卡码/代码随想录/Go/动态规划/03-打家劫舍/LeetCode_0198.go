// 198. 打家劫舍
package main

import (
	"math"
)

func rob(nums []int) int {
	dp := make([]int, len(nums))
	dp[0] = nums[0]
	if len(nums) > 1 {
		dp[1] = int(math.Max(float64(nums[0]), float64(nums[1])))
	}
	for i := 2; i < len(nums); i++ {
		dp[i] = int(math.Max(float64(dp[i-1]), float64(dp[i-2]+nums[i])))
	}
	return dp[len(nums)-1]
}
