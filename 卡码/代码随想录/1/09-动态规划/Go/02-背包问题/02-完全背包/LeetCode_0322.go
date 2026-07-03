// 322. 零钱兑换
package main

import "math"

func coinChange(coins []int, amount int) int {
	dp := make([]int, amount+1)
	for i := 0; i < len(dp); i++ {
		dp[i] = math.MaxInt32 - 1
	}
	dp[0] = 0
	for _, coin := range coins {
		for j := coin; j <= amount; j++ {
			dp[j] = int(math.Min(float64(dp[j]), float64(dp[j-coin]+1)))
		}
	}
	if dp[amount] == math.MaxInt32-1 {
		return -1
	} else {
		return dp[amount]
	}
}
