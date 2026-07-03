//18. 四数之和
package main

import "sort"

func fourSum(nums []int, target int) [][]int {
	res:=[][]int{}
	sort.Ints(nums)
	for k:=0;k<len(nums)-3;k++ {
		//剪枝
		if nums[k]>target&&nums[k]>=0 {
			break
		}
		//去重
		if k>0&&nums[k]==nums[k-1] {
			continue
		}
		for i:=k+1;i<len(nums)-2;i++ {
			if nums[k]+nums[i]>target && nums[i]>=0 {
				break
			}
			if i>k+1&&nums[i]==nums[i-1] {
				continue
			}
			left,right:=i+1,len(nums)-1
			for left<right {
				tmp:=nums[k]+nums[i]+nums[left]+nums[right]
				//四数之和等于target
				if tmp==target {
					res=append(res,[]int{nums[k],nums[i],nums[left],nums[right]})
					for left<right&&nums[left]==nums[left+1] {
						left++
					}
					for left<right&&nums[right]==nums[right-1] {
						right--
					}
					left++
					right--
				}else if tmp>target {
					right--
				}else{
					left++
				}
			}
		}
	}
	return res
}
