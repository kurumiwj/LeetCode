//5. A+B问题VII
package main

import (
	"fmt"
)

func main(){
	for {
		var a,b int
		_,err:=fmt.Scanln(&a,&b)
		if err!=nil {
			return
		}
		fmt.Println(a+b)
		fmt.Println()
	}
}
