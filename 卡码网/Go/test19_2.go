// 19. 单链表反转
package main

import (
	"fmt"
	"sort"
)

func main(){
	var n int
	for {
		_,err:=fmt.Scan(&n)
		if err!=nil {
			return
		}
		if n==0 {
			fmt.Println("list is empty")
			continue
		}
		nums:=make([]int,n,n)
		for i:=0;i<n;i++ {
			fmt.Scan(&nums[i])
			if i!=0 {
				fmt.Print(" ")
			}
			fmt.Print(nums[i])
		}
		fmt.Println()
		sort.Slice(nums,func (i,j int) bool{
			return nums[i]>nums[j];
		})
		for index,value:=range nums {
			if index!=0 {
				fmt.Print(" ")
			}
			fmt.Print(value)
		}
		fmt.Println()
	}
}
