//46. 全排列
package main

func permute(nums []int) [][]int {
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
			if visited[i]==true {
				continue
			}
			visited[i]=true
			path=append(path,nums[i])
			backtracking(nums)
			path=path[:len(path)-1]
			visited[i]=false
		}
	}
	backtracking(nums)
	return res
}
