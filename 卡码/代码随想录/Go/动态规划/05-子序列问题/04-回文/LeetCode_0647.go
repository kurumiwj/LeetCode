// 647. 回文子串
package main

// 动态规划
func countSubstrings(s string) int {
	res := 0
	dp := make([][]bool, len(s))
	for i := 0; i < len(s); i++ {
		dp[i] = make([]bool, len(s))
	}
	for i := len(s) - 1; i >= 0; i-- {
		for j := i; j < len(s); j++ {
			if s[i] == s[j] && (j-i <= 1 || dp[i+1][j-1] == true) {
				dp[i][j] = true
				res++
			}
		}
	}
	return res
}

// 双指针
func countSubstrings1(s string) int {
	res := 0
	for i := 0; i < len(s); i++ {
		res += countPalindrome(s, i, i)
		res += countPalindrome(s, i, i+1)
	}
	return res
}
func countPalindrome(s string, i, j int) int {
	res := 0
	for i >= 0 && j < len(s) && s[i] == s[j] {
		i--
		j++
		res++
	}
	return res
}
