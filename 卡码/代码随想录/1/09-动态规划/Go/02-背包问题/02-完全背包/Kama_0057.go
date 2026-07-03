// 57. 爬楼梯
package main

import (
	"fmt"
)

func main() {
	var m, n int
	fmt.Scan(&n, &m)
	dp := make([]int, n+1)
	dp[0] = 1
	for i := 1; i <= n; i++ {
		for j := 1; j <= m; j++ {
			if i >= j {
				dp[i] += dp[i-j]
			} else {
				break
			}
		}
	}
	fmt.Println(dp[n])
}
