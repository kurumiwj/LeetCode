//977. 有序数组的平方
package main

import "fmt"

func sortedSquares(nums []int) []int {
	res:=make([]int,len(nums))
	k:=len(nums)-1
	for i,j:=0,len(nums)-1;i<=j; {
		if pow2(nums[i])>pow2(nums[j]) {
			res[k]=pow2(nums[i])
			i++
		}else{
			res[k]=pow2(nums[j])
			j--
		}
		k--
	}
	return res
}

func pow2(n int) int{
	return n*n
}

func main(){
	nums:=[]int{-4,-1,0,3,10}
	fmt.Println(sortedSquares(nums))
}
