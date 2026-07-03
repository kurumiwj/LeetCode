//10. 运营商活动
package main

import (
	"fmt"
)

func main(){
	for {
		var m,k int
		_,err:=fmt.Scan(&m,&k)
		if err!=nil||m==0&&k==0 {
			return
		}
		var total=m
		for m>=k {
			left:=m/k
			total+=left
			m=left+m%k
		}
		fmt.Println(total)
	}
}
