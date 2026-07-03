// 343. 整数拆分
package main

import "math"

func integerBreak(n int) int {
	dp:=make([]int,n+1)
	for i:=0;i<len(dp);i++ {
		dp[i]=0
	}
	dp[0],dp[1],dp[2]=0,0,1
	for i:=3;i<n+1;i++ {
		for j:=1;j<=i/2;j++ {
			dp[i]=int(math.Max(float64(dp[i]),math.Max(float64(j*(i-j)),float64(j*dp[i-j]))))
		}
	}
	return dp[n]
}
