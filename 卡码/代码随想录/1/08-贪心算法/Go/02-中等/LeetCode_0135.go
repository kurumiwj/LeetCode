// 135. 分发糖果
package main

import "math"

func candy(ratings []int) int {
	can:=make([]int,len(ratings))
	for i:=0;i<len(can);i++ {
		can[i]=1
	}
	for i:=1;i<len(can);i++ {
		if ratings[i]>ratings[i-1] {
			can[i]=can[i-1]+1
		}
	}
	for i:=len(ratings)-2;i>=0;i-- {
		if ratings[i]>ratings[i+1] {
			can[i]=int(math.Max(float64(can[i+1]+1),float64(can[i])))
		}
	}
	sum:=0
	for _,val:=range can {
		sum+=val
	}
	return sum
}
