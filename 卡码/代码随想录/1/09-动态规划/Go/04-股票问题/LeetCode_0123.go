// 123. 买卖股票的最佳时机 III
package main

import (
	"math"
)

func maxProfit(prices []int) int {
	dp := []int{-prices[0], 0, -prices[0], 0}
	for i := 1; i < len(prices); i++ {
		dp[0] = int(math.Max(float64(dp[0]), float64(-prices[i])))
		dp[1] = int(math.Max(float64(dp[1]), float64(dp[0]+prices[i])))
		dp[2] = int(math.Max(float64(dp[2]), float64(dp[1]-prices[i])))
		dp[3] = int(math.Max(float64(dp[3]), float64(dp[2]+prices[i])))
	}
	return dp[3]
}
