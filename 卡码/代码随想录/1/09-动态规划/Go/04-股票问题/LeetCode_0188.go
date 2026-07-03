// 188. 买卖股票的最佳时机 IV
package main

func max(a, b int) int {
	if a > b {
		return a
	} else {
		return b
	}
}

func maxProfit(k int, prices []int) int {
	dp := make([]int, 2*k)
	for i := 0; i < 2*k; i += 2 {
		dp[i] = -prices[0]
	}
	for i := 1; i < len(prices); i++ {
		dp[0] = max(dp[0], -prices[i])
		dp[1] = max(dp[1], dp[0]+prices[i])
		for j := 2; j < 2*k; j += 2 {
			dp[j] = max(dp[j], dp[j-1]-prices[i])
			dp[j+1] = max(dp[j+1], dp[j]+prices[i])
		}
	}
	return dp[2*k-1]
}
