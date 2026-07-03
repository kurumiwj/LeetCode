// 763. 划分字母区间
package main

import "math"

func partitionLabels(s string) []int {
	hash:=make([]int,30)
	left,right:=0,0
	res:=make([]int,0)
	for i,ch:=range s {
		hash[ch-'a']=i
	}
	for i,ch:=range s {
		right=int(math.Max(float64(right),float64(hash[ch-'a'])))
		if i==right {
			res=append(res,right-left+1)
			left=i+1
		}
	}
	return res
}
