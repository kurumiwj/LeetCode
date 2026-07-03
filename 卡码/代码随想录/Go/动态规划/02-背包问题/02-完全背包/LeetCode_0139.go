// 139. 单词拆分
package main

import (
	"slices"
)

func wordBreak(s string, wordDict []string) bool {
	dp := make([]bool, len(s)+1)
	for i := 1; i <= len(s); i++ {
		dp[i] = false
	}
	dp[0] = true
	for i := 1; i <= len(s); i++ {
		for j := 0; j < i; j++ {
			if slices.Contains(wordDict, s[j:i]) && dp[j] == true {
				dp[i] = true
			}
		}
	}
	return dp[len(s)]
}
