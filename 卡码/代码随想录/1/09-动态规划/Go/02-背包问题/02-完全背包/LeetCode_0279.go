// 279. 完全平方数
package main

import (
	"math"
)

func numSquares(n int) int {
	dp := make([]int, n+1)
	for i := 0; i < n+1; i++ {
		dp[i] = math.MaxInt32 - 1
	}
	dp[0] = 0
	for i := 1; i*i <= n; i++ {
		for j := i * i; j <= n; j++ {
			dp[j] = int(math.Min(float64(dp[j]), float64(dp[j-i*i]+1)))
		}
	}
	return dp[n]
}
