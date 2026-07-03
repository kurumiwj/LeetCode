//4. A+B问题IV
package main

import (
	"fmt"
)

func main(){
	for {
		var n int
		fmt.Scan(&n)
		if n==0 {
			return
		}
		var sum=0
		for i:=0;i<n;i++ {
			var tmp int
			fmt.Scan(&tmp)
			sum+=tmp
		}
		fmt.Println(sum)
	}
}
