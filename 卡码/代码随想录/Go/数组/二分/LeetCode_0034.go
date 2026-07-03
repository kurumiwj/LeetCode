//34. 在排序数组中查找元素的第一个和最后一个位置
package main

import "fmt"

func searchRange(nums []int, target int) []int {
	left,right:=0,len(nums)-1
	for left<=right {
		middle:=(left+right)/2
		if nums[middle]==target {
			start,end:=middle-1,middle+1
			for start>=0&&nums[start]==target {
				start--
			}
			for end<=len(nums)-1&&nums[end]==target {
				end++
			}
			return []int{start+1,end-1}
		}else if target<nums[middle] {
			right=middle-1
		}else{
			left=middle+1
		}
	}
	return []int{-1,-1}
}

func main(){
	nums:=[]int{5,7,7,8,8,10}
	fmt.Println(searchRange(nums,8))
	fmt.Println(searchRange(nums,6))
	fmt.Println(searchRange(nums,0))
}
