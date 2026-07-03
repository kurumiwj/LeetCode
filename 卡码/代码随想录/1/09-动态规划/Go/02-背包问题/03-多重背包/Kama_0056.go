// 56. 携带矿石资源
package main

import (
	"fmt"
	"math"
)

func main() {
	var c, n int
	fmt.Scan(&c, &n)
	w, v, k := make([]int, n), make([]int, n), make([]int, n)
	for i := 0; i < n; i++ {
		fmt.Scan(&w[i])
	}
	for i := 0; i < n; i++ {
		fmt.Scan(&v[i])
	}
	for i := 0; i < n; i++ {
		fmt.Scan(&k[i])
	}
	dp := make([]int, c+1)
	for i := 0; i < n; i++ {
		for j := c; j >= w[i]; j-- {
			for l := 1; l <= k[i] && j >= l*w[i]; l++ {
				dp[j] = int(math.Max(float64(dp[j]), float64(dp[j-l*w[i]]+l*v[i])))
			}
		}
	}
	fmt.Println(dp[c])
}
