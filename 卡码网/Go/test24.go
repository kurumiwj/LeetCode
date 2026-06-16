//24. 最长公共子序列
package main

import (
	"fmt"
)

func max(a,b int) int{
	if a>b {
		return a
	}else{
		return b
	}
}

func main(){
	var str1,str2 string
	for {
		_,err:=fmt.Scan(&str1,&str2)
		if err!=nil {
			break
		}
		if len(str1)>0 && len(str2)>0 {
			var n1,n2=len(str1),len(str2)
			var dp=make([][]int,n1+1)
			for i:=0;i<len(dp);i++ {
				dp[i]=make([]int,n2+1)
			}
			for i:=1;i<=n1;i++ {
				for j:=1;j<=n2;j++ {
					if str1[i-1]==str2[j-1] {
						dp[i][j]=dp[i-1][j-1]+1
					}else{
						dp[i][j]=max(dp[i][j-1],dp[i-1][j])
					}
				}
			}
			fmt.Println(dp[n1][n2])
		}
	}
}
