// 1049. 最后一块石头的重量 II
package main

import "math"

func lastStoneWeightII(stones []int) int {
	sum:=0
	for _,stone:=range stones {
		sum+=stone
	}
	target:=sum/2
	dp:=make([]int,1501)
	for i:=0;i<len(stones);i++ {
		for j:=target;j>=stones[i];j-- {
			dp[j]=int(math.Max(float64(dp[j]),float64(dp[j-stones[i]]+stones[i])))
		}
	}
	return sum-2*dp[target]
}
