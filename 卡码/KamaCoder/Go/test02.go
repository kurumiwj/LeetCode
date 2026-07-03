//2. A+B问题II
package main

import (
	"fmt"
)

func main(){
	for {
		var n int
		_,err:=fmt.Scanln(&n)
		if err!=nil {
			return
		}
		for i:=0;i<n;i++ {
			var a,b int
			fmt.Scanln(&a,&b)
			fmt.Println(a+b)
		}
	}
}
