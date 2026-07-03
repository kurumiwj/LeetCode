// 516. 最长回文子序列
package main

import (
	"math"
)

func longestPalindromeSubseq(s string) int {
	n := len(s)
	dp := make([][]int, n)
	for i := 0; i < n; i++ {
		dp[i] = make([]int, n)
		dp[i][i] = 1
	}
	for i := n - 1; i >= 0; i-- {
		for j := i + 1; j < n; j++ {
			if s[i] == s[j] {
				dp[i][j] = dp[i+1][j-1] + 2
			} else {
				dp[i][j] = int(math.Max(float64(dp[i][j-1]), float64(dp[i+1][j])))
			}
		}
	}
	return dp[0][n-1]
}
