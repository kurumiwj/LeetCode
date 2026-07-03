//11. 共同祖先
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
		commons:=make([]int,21,21)
		var a,b int
		for i:=0;i<n;i++ {
			fmt.Scan(&a,&b)
			commons[a]=b
		}
		//计算1、2的树高度
		len1,len2:=0,0
		//1、2起点
		start1,start2:=1,2
		for commons[start1]!=0 {
			start1=commons[start1]
			len1++
		}
		for commons[start2]!=0 {
			start2=commons[start2]
			len2++
		}
		if len1>len2 {
			fmt.Println("You are my elder")
		}else if len1<len2 {
			fmt.Println("You are my younger")
		}else{
			fmt.Println("You are my brother")
		}
	}
}
