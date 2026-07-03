//47. 全排列 II
package main

import "sort"

func permuteUnique(nums []int) [][]int {
	res:=make([][]int,0)
	path:=make([]int,0)
	visited:=make([]bool,len(nums))
	for i:=0;i<len(nums);i++ {
		visited[i]=false
	}
	var backtracking func(nums []int)
	backtracking=func(nums []int){
		if len(path)==len(nums) {
			tmp:=make([]int,len(path))
			copy(tmp,path)
			res=append(res,tmp)
			return
		}
		for i:=0;i<len(nums);i++ {
			if i>0&&nums[i]==nums[i-1]&&visited[i-1]==false||visited[i]==true {
				continue
			}
			visited[i]=true
			path=append(path,nums[i])
			backtracking(nums)
			path=path[:len(path)-1]
			visited[i]=false
		}
	}
	sort.Ints(nums)
	backtracking(nums)
	return res
}
