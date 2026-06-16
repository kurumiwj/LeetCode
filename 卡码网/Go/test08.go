//8. 摆平积木
package main

import (
	"fmt"
)

func main(){
	for{
		var n int
		fmt.Scan(&n)
		if n==0 {
			return
		}
		var arr=make([]int,n,n)
		var sum=0
		for i:=0;i<n;i++ {
			fmt.Scan(&arr[i])
			sum+=arr[i]
		}
		avg:=sum/n
		var cnt int=0
		for _,value:=range arr {
			if value>avg {
				cnt+=value-avg
			}
		}
		fmt.Println(cnt)
		fmt.Println()
	}
}
