// 15. 三数之和
package main

import (
	"sort"
)

func threeSum(nums []int) [][]int {
	sort.Ints(nums)
	res:=[][]int{}
	for i:=0;i<len(nums)-2;i++ {
		n1:=nums[i]
		//如果排序后第一个元素大于0则一定无解
		if n1>0 {
			break
		}
		//去重
		if i>0&&nums[i]==nums[i-1] {
			continue
		}
		left,right:=i+1,len(nums)-1
		for left<right {
			n2,n3:=nums[left],nums[right]
			if n1+n2+n3==0 {
				res=append(res,[]int{n1,n2,n3})
				//去重
				for left<right&&nums[left]==n2 {
					left++
				}
				for left<right&&nums[right]==n3 {
					right--
				}
			}else if n1+n2+n3<0 {
				left++
			}else{
				right--
			}
		}
	}
	return res
}
