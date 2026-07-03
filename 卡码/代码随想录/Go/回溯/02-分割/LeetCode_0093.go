// 93. 复原 IP 地址
package main

import "strings"

func isValid(s string,start,end int) bool{
	if start>end||s[start]=='0'&&start!=end {
		return false
	}
	num:=0
	for i:=start;i<=end;i++ {
		digit:=int(s[i]-'0')
		num=num*10+digit
		if num>255 {
			return false
		}
	}
	return true
}

func restoreIpAddresses(s string) []string {
	var res=make([]string,0)
	var path=make([]string,0)
	var backtracking func(s string,index,dotNum int)
	backtracking=func(s string,index,dotNum int){
		if index==len(s)&&dotNum==4 {
			res=append(res,strings.Join(path,"."))
			return
		}
		for i:=index;i<len(s)&&i-index<3;i++ {
			if isValid(s,index,i) {
				path=append(path,s[index:i+1])
				backtracking(s,i+1,dotNum+1)
				path=path[:len(path)-1]
			}else{
				break
			}
		}
	}
	backtracking(s,0,0)
	return res
}
