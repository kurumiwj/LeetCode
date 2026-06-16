//17. 出栈合法性
package main

import (
	"fmt"
)

func main(){
	for {
		var n int
		_,err:=fmt.Scan(&n)
		if err!=nil||n==0 {
			return
		}
		nums:=make([]int,n,n)
		for i:=0;i<n;i++ {
			fmt.Scan(&nums[i])
		}
		stack:=make([]int,0,n)
		index:=0
		for i:=1;i<=n;i++ {
			stack=append(stack,i)
			//如果栈不为空且栈顶元素与要出栈元素相等则出栈
			for len(stack)>0&&stack[len(stack)-1]==nums[index] {
				stack=stack[:len(stack)-1]
				index++
			}
		}
		//如果结束栈不为空则不合法，否则合法
		if len(stack)>0 {
			fmt.Println("No")
		}else{
			fmt.Println("Yes")
		}
	}
}
