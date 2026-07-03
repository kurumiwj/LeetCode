// 53. 最大子数组和
package main

import (
	"math"
)

func maxSubArray(nums []int) int {
	dp := make([]int, len(nums))
	dp[0] = nums[0]
	res := nums[0]
	for i := 1; i < len(nums); i++ {
		dp[i] = int(math.Max(float64(dp[i-1]+nums[i]), float64(nums[i])))
		if dp[i] > res {
			res = dp[i]
		}
	}
	return res
}
