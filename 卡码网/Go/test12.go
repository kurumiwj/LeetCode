//12. 打印数字图形
package main

import (
	"fmt"
)

func printLine(n int){
	for i:=1;i<=n;i++ {
		fmt.Print(i)
	}
	for i:=n-1;i>=1;i-- {
		fmt.Print(i)
	}
	fmt.Println()
}

func main(){
	var n int
	for {
		_,err:=fmt.Scan(&n)
		if err!=nil {
			return
		}
		for i:=1;i<=n;i++ {
			for j:=0;j<n-i;j++ {
				fmt.Print(" ")
			}
			printLine(i)
		}
		for i:=n-1;i>=1;i-- {
			for j:=0;j<n-i;j++ {
				fmt.Print(" ")
			}
			printLine(i)
		}
	}
}
