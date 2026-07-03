//27. 移除元素
package main

import "fmt"

func removeElement(nums []int, val int) int {
	fast,slow:=0,0
	for fast=0;fast<len(nums);fast++ {
		if nums[fast]!=val {
			nums[slow]=nums[fast]
			slow++
		}
	}
	return slow
}

func main(){
	// nums:=[]int{3,2,2,3}
	nums:=[]int{0,1,2,2,3,0,4,2}
	n:=removeElement(nums,2)
	fmt.Println(n)
}
