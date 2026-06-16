//16. 位置互换
package main

import (
	"fmt"
)

func main(){
	var n int
	fmt.Scanf("%d\n",&n)
	for i:=0;i<n;i++ {
		var str string
		fmt.Scanln(&str)
		bytes:=[]byte(str)
		for j:=0;j<len(bytes);j+=2 {
			bytes[j],bytes[j+1]=bytes[j+1],bytes[j]
		}
		fmt.Println(string(bytes))
	}
}
