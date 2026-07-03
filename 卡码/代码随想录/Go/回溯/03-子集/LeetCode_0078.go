//78. 子集
package main

func subsets(nums []int) [][]int {
	res:=make([][]int,0)
	path:=make([]int,0)
	var backtracking func(nums []int,index int)
	backtracking=func(nums []int,index int){
		tmp:=make([]int,len(path))
		copy(tmp,path)
		res=append(res,tmp)
		if index>=len(nums) {
			return
		}
		for i:=index;i<len(nums);i++ {
			path=append(path,nums[i])
			backtracking(nums,i+1)
			path=path[:len(path)-1]
		}
	}
	backtracking(nums,0)
	return res
}
