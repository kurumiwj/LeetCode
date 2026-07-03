// 674. 最长连续递增序列
package main

func findLengthOfLCIS(nums []int) int {
	dp := make([]int, len(nums))
	for i := 0; i < len(dp); i++ {
		dp[i] = 1
	}
	res := 1
	for i := 1; i < len(nums); i++ {
		if nums[i] > nums[i-1] {
			dp[i] = dp[i-1] + 1
		}
		if dp[i] > res {
			res = dp[i]
		}
	}
	return res
}
