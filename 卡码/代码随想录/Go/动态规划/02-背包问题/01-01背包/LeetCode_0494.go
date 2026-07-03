// 494. 目标和
package main

import "math"

func findTargetSumWays(nums []int, target int) int {
	sum:=0
	for _,num:=range nums {
		sum+=num
	}
	if math.Abs(float64(target))>float64(sum)||(sum+target)%2==1 {
		return 0
	}
	n:=(sum+target)/2
	dp:=make([]int,n+1)
	dp[0]=1
	for i:=0;i<len(nums);i++ {
		for j:=n;j>=nums[i];j-- {
			dp[j]+=dp[j-nums[i]]
		}
	}
	return dp[n]
}
