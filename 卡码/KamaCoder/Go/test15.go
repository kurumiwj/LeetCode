//15. 神秘字符
package main

import (
	"fmt"
)

func main(){
	var n int
	fmt.Scanf("%d\n",&n)
	for i:=0;i<n;i++ {
		var str1,str2 string
		fmt.Scanln(&str1)
		fmt.Scanln(&str2)
		middle:=len(str1)/2
		var ret=str1[:middle]+str2+str1[middle:]
		fmt.Println(ret)
	}
}
