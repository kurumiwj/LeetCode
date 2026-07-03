// 1005. K 次取反后最大化的数组和
package main

import (
	"math"
	"sort"
)

func largestSumAfterKNegations(nums []int, k int) int {
	sort.Slice(nums,func(i,j int) bool{
		return math.Abs(float64(nums[i]))>math.Abs(float64(nums[j]))
	})
	res:=0
	for i:=0;i<len(nums);i++ {
		if k>0&&nums[i]<0 {
			nums[i]*=-1
			k--
		}
		res+=nums[i]
	}
	if k%2==1 {
		res-=2*nums[len(nums)-1]
	}
	return res
}
