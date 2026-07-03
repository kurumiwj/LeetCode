// 474. 一和零
package main

import "math"

func findMaxForm(strs []string, m int, n int) int {
	dp:=make([][]int,m+1)
	for i:=0;i<m+1;i++ {
		dp[i]=make([]int,n+1)
	}
	for _,str:=range strs {
		x,y:=0,0
		for _,ch:=range str {
			if ch=='0' {
				x++
			}else{
				y++
			}
		}
		for i:=m;i>=x;i-- {
			for j:=n;j>=y;j-- {
				dp[i][j]=int(math.Max(float64(dp[i][j]),float64(dp[i-x][j-y]+1)))
			}
		}
	}
	return dp[m][n]
}
