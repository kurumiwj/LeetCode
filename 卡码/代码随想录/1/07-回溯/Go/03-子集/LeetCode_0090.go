// 90. 子集 II
package main

import "sort"

func subsetsWithDup(nums []int) [][]int {
	res:=make([][]int,0)
	path:=make([]int,0)
	var backtracking func(nums []int,index int)
	backtracking=func(nums []int,index int){
		tmp:=make([]int,len(path))
		copy(tmp,path)
		res=append(res,tmp)
		for i:=index;i<len(nums);i++ {
			if i>index&&nums[i]==nums[i-1] {
				continue
			}
			path=append(path,nums[i])
			backtracking(nums,i+1)
			path=path[:len(path)-1]
		}
	}
	sort.Ints(nums)
	backtracking(nums,0)
	return res
}
