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
		//判断出栈顺序是否合法
		var isValid=true
		//切片模拟栈
		var nums=make([]int,0,n+1)
		index:=1
		for i:=1;i<=n;i++ {
			var tmp int
			fmt.Scan(&tmp)
			//只有当出栈顺序合法才继续进行
			if isValid {
				//如果栈空
				if len(nums)==0 {
					nums=append(nums,index)
				}
				//如果栈顶元素小于出栈元素则入栈
				for nums[len(nums)-1]<tmp {
					nums=append(nums,index)
					index++
				}
				//如果栈顶元素等于出栈元素则出栈，否则出错
				if nums[len(nums)-1]==tmp {
					nums=nums[:len(nums)-1]
				}else{
					isValid=false
				}
			}
		}
		if isValid {
			fmt.Println("Yes")
		}else{
			fmt.Println("No")
		}
	}
}
