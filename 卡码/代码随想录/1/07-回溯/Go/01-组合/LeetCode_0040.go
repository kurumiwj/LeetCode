// 40. 组合总和 II
package main

import "sort"

func combinationSum2(candidates []int, target int) [][]int {
	path:=make([]int,0)
	res:=make([][]int,0)
	var backtracking func(candidates []int,target,sum,index int)
	backtracking=func(candidates []int,target,sum,index int){
		if sum==target {
			tmp:=make([]int,len(path))
			copy(tmp,path)
			res=append(res,tmp)
			return
		}
		for i:=index;i<len(candidates)&&sum+candidates[i]<=target;i++ {
			if i>index&&candidates[i]==candidates[i-1] {
				continue
			}
			path=append(path,candidates[i])
			backtracking(candidates,target,sum+candidates[i],i+1)
			path=path[:len(path)-1]
		}
	}
	sort.Slice(candidates,func(i,j int) bool{
		return candidates[i]<candidates[j]
	})
	backtracking(candidates,target,0,0)
	return res
}
