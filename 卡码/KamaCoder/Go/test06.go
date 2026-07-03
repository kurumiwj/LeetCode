// 6. A+B问题VIII
package main

import (
	"fmt"
)

func main(){
	for {
		var n int
		if _,err:=fmt.Scan(&n);err!=nil {
			return
		}
		for i:=0;i<n;i++ {
			var m int
			fmt.Scan(&m)
			var sum int
			for j:=0;j<m;j++ {
				var tmp int
				fmt.Scan(&tmp)
				sum+=tmp
			}
			fmt.Println(sum)
			if i!=n-1 {
				fmt.Println()
			}
		}
	}
}
