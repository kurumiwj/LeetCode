//704. 二分查找
package main

import "fmt"

func search(nums []int, target int) int {
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
	return -1
}

func main(){
	nums := []int{-1,0,3,5,9,12}
	fmt.Println(search(nums,9))
	fmt.Println(search(nums,2))
	fmt.Println(search(nums,13))
}
