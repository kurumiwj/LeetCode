// 714. 买卖股票的最佳时机含手续费
package main

func max(a, b int) int {
	if a > b {
		return a
	} else {
		return b
	}
}

func maxProfit(prices []int, fee int) int {
	dp := [2]int{-prices[0], 0}
	for i := 1; i < len(prices); i++ {
		dp[0] = max(dp[0], dp[1]-prices[i])
		dp[1] = max(dp[1], dp[0]+prices[i]-fee)
	}
	return dp[1]
}
