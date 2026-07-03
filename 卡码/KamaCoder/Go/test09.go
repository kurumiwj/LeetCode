//9. 奇怪的信
package main

import (
	"fmt"
)

func getEven(n int) int{
	tmp:=n
	var sum=0
	for tmp>0 {
		digit:=tmp%10
		if digit%2==0 {
			sum+=digit
		}
		tmp/=10
	}
	return sum
}

func main(){
	for {
		var n int
		_,err:=fmt.Scan(&n)
		if err!=nil {
			return
		}
		fmt.Println(getEven(n))
		fmt.Println()
	}
}
