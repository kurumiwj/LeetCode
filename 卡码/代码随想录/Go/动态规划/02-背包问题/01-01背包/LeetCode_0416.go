// 416. 分割等和子集
package main

import "math"

func canPartition(nums []int) bool {
	sum:=0
	for _,num:=range nums {
		sum+=num
	}
	if sum%2==1 {
		return false
	}
	target:=sum/2
	dp:=make([]int,10001)
	for i:=0;i<len(nums);i++ {
		for j:=target;j>=nums[i];j-- {
			dp[j]=int(math.Max(float64(dp[j]),float64(dp[j-nums[i]]+nums[i])))
		}
	}
	if dp[target]==target {
		return true
	}
	return false
}
