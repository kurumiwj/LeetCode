// 46. 携带研究材料
package main

import (
	"fmt"
	"math"
)

func main(){
	var m,n int
	fmt.Scan(&m,&n)
	weight,value:=make([]int,m),make([]int,m)
	for i:=0;i<m;i++ {
		fmt.Scan(&weight[i])
	}
	for i:=0;i<m;i++ {
		fmt.Scan(&value[i])
	}
	dp:=make([]int,n+1)
	for i:=0;i<m;i++ {
		for j:=n;j>=weight[i];j-- {
			dp[j]=int(math.Max(float64(dp[j]),float64(dp[j-weight[i]]+value[i])))
		}
	}
	fmt.Println(dp[n])
}
