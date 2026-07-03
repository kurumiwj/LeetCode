// 53. 最大子数组和
package main

import "math"

func maxSubArray(nums []int) int {
	if len(nums)<=1 {
		return len(nums)
	}
	res,cnt:=math.MinInt,0
	for _,num:=range nums {
		cnt+=num
		if cnt>res {
			res=cnt
		}
		if cnt<=0 {
			cnt=0
		}
	}
	return res
}
