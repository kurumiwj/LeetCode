//491. 非递减子序列
package main

import "slices"

func findSubsequences(nums []int) [][]int {
	res:=make([][]int,0)
	path:=make([]int,0)
	var backtracking func(nums []int,index int)
	backtracking=func(nums []int,index int){
		if len(path)>1 {
			tmp:=make([]int,len(path))
			copy(tmp,path)
			res=append(res,tmp)
		}
		visited:=make([]bool,201)
		for i:=0;i<len(visited);i++ {
			visited[i]=false
		}
		for i:=index;i<len(nums);i++ {
			if len(path)>0&&nums[i]<path[len(path)-1]||visited[nums[i]+100] {
				continue
			}
			visited[nums[i]+100]=true
			path=append(path,nums[i])
			backtracking(nums,i+1)
			path=path[:len(path)-1]
		}
	}
	backtracking(nums,0)
	return res
}
