//13. 镂空三角形
package main

import (
	"fmt"
)

//输出行
func printLine(c byte,n int,m int){
	for i:=1;i<=2*n-1;i++ {
		//打印两头
		if i==1||i==2*n-1 {
			fmt.Printf("%c",c)
		}else{
			//打印底边
			if n==m {
				fmt.Printf("%c",c)
			}else{	//打印空格
				fmt.Print(" ")
			}
		}
	}
	fmt.Println()
}

func main(){
	var c byte
	var n int
	for {
		_,err:=fmt.Scanf("%c %d\n",&c,&n)
		if err!=nil||c=='@' {
			return
		}
		for i:=1;i<=n;i++ {
			for j:=0;j<n-i;j++ {
				fmt.Print(" ")
			}
			printLine(c,i,n)
		}
		fmt.Println()
	}
}
