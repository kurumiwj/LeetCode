// 121. 买卖股票的最佳时机
package main

import (
	"math"
)

func maxProfit(prices []int) int {
	dp := []int{prices[0], 0}
	for i := 1; i <= len(prices); i++ {
		dp[0] = int(math.Min(float64(dp[0]), float64(prices[i-1])))
		dp[1] = int(math.Max(float64(dp[1]), float64(prices[i-1]-dp[0])))
	}
	return dp[1]
}
