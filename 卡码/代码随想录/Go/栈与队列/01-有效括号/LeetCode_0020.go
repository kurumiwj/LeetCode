//20. 有效的括号
package main

func isValid(s string) bool {
	if len(s)%2!=0 {
		return false
	}
	stack:=make([]rune,0)
	for _,ch:=range s {
		if ch=='(' {
			stack=append(stack,')')
		}else if ch=='[' {
			stack=append(stack,']')
		}else if ch=='{' {
			stack=append(stack,'}')
		}else if len(stack)==0||stack[len(stack)-1]!=ch {
			return false
		}else{
			stack=stack[0:len(stack)-1]
		}
	}
	return len(stack)==0
}
