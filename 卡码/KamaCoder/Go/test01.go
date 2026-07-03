// 1. A+B问题I
package main

import (
	"fmt"
)

func main(){
	var a,b int
	for {
		_,err:=fmt.Scan(&a,&b)
		if err!=nil {
			return
		}
		fmt.Println(a+b)
	}
}
