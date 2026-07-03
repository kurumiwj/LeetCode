// 150. 逆波兰表达式求值
package main

import "strconv"

func evalRPN(tokens []string) int {
	nums:=make([]int,0)
	var n1,n2 int
	for _,token:=range tokens {
		if token=="+"||token=="-"||token=="*"||token=="/" {
			n2=nums[len(nums)-1]
			n1=nums[len(nums)-2]
			nums=nums[0:len(nums)-2]
		}
		switch token {
			case "+":
				nums=append(nums,n1+n2)
			case "-":
				nums=append(nums,n1-n2)
			case "*":
				nums=append(nums,n1*n2)
			case "/":
				nums=append(nums,n1/n2)
			default:
				num,_:=strconv.Atoi(token)
				nums=append(nums,num)
		}
	}
	return nums[len(nums)-1]
}
