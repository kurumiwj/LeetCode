//216. 组合总和 III
package main

func combinationSum3(k int, n int) [][]int {
	path:=make([]int,0)
	res:=make([][]int,0)
	var backtracking func(k,n,sum,index int)
	backtracking=func(k,n,sum,index int){
		if sum>n {
			return
		}
		if k==len(path) {
			if sum==n {
				tmp:=make([]int,k)
				copy(tmp,path)
				res=append(res,tmp)
			}
			return
		}
		for i:=index;i<=10-(k-len(path));i++ {
			path=append(path,i)
			backtracking(k,n,sum+i,i+1)
			path=path[:len(path)-1]
		}
	}
	backtracking(k,n,0,1)
	return res
}
