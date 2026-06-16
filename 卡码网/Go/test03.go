//3. A+B问题III
package main

import (
	"fmt"
)

func main(){
	for{
		var a,b int
		fmt.Scanln(&a,&b)
		if a==0&&b==0 {
			return
		}
		fmt.Println(a+b)
	}
}
