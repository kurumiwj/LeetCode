// 45. 跳跃游戏 II
package main

import "math"

func jump(nums []int) int {
	res,cur,next:=0,0,0
	for i:=0;i<len(nums)-1;i++ {
		next=int(math.Max(float64(i+nums[i]),float64(next)))
		if i==cur {
			cur=next
			res++
		}
	}
	return res
}
