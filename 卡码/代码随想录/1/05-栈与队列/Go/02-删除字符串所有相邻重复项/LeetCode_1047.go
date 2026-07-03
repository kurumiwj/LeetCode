//1047. 删除字符串中的所有相邻重复项
package main

func removeDuplicates(s string) string {
	stack:=make([]rune,0)
	for _,ch:=range s {
		if len(stack)==0 || stack[len(stack)-1]!=ch {
			stack=append(stack,ch)
		}else{
			stack=stack[0:len(stack)-1]
		}
	}
	var str string=""
	for _,ch:=range stack {
		str+=string(ch)
	}
	return str
}
