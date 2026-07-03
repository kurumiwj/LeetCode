//35. 搜索插入位置
package main

import "fmt"

func searchInsert(nums []int, target int) int {
	left,right:=0,len(nums)-1
	for left<=right {
		middle:=(left+right)/2
		if nums[middle]==target {
			return middle
		}else if target<nums[middle] {
			right=middle-1
		}else{
			left=middle+1
		}
	}
	return left
}

func main(){
	nums := []int{1,3,5,6}
	fmt.Println(searchInsert(nums,5))
	fmt.Println(searchInsert(nums,2))
	fmt.Println(searchInsert(nums,7))
}
