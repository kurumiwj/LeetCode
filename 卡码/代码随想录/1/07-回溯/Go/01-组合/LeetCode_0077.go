//77. 组合
package main

func combine(n int, k int) [][]int {
	path:=make([]int,0)
	res:=make([][]int,0)
	var backtracking func(n,k,index int)
	backtracking=func(n,k,index int){
		if k==len(path) {
			tmp:=make([]int,k)
			copy(tmp,path)
			res=append(res,tmp)
			return
		}
		for i:=index;i<=n;i++ {
			if n+1-i<k-len(path) {
				break
			}
			path=append(path,i)
			backtracking(n,k,i+1)
			path=path[:len(path)-1]
		}
	}
	backtracking(n,k,1)
	return res
}
