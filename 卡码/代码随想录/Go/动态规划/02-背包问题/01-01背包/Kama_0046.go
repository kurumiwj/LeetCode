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
	dp:=make([][]int,m)
	for i:=0;i<m;i++ {
		dp[i]=make([]int,n+1)
	}
	for i:=weight[0];i<n+1;i++ {
		dp[0][i]=value[0]
	}
	for i:=1;i<m;i++ {
		for j:=1;j<n+1;j++ {
			if j<weight[i] {
				dp[i][j]=dp[i-1][j]
			}else{
				dp[i][j]=int(math.Max(float64(dp[i-1][j]),float64(dp[i-1][j-weight[i]]+value[i])))
			}
		}
	}
	fmt.Println(dp[m-1][n])
}
