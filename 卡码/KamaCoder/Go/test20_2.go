//20. 删除重复元素
package main

import (
	"fmt"
)

func main(){
	var n int
	for {
		_,err:=fmt.Scan(&n)
		if err!=nil {
			return
		}
		if n==0 {
			fmt.Println("list is empty\n")
			continue
		}
		nums:=make([]int,n,n)
		for i:=0;i<n;i++ {
			if i!=0 {
				fmt.Print(" ")
			}
			fmt.Scan(&nums[i])
			fmt.Print(nums[i])
		}
		fmt.Println()
		fmt.Print(nums[0])
		for i:=1;i<n;i++ {
			if nums[i]!=nums[i-1] {
				fmt.Print(" ")
				fmt.Print(nums[i])
			}
		}
		fmt.Println()
	}
}
