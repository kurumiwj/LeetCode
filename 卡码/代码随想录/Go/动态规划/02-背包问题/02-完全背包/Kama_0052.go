package main

import (
	"fmt"
	"math"
)

func main() {
	var n, v int
	fmt.Scan(&n, &v)
	weight, value := make([]int, n), make([]int, n)
	for i := 0; i < n; i++ {
		fmt.Scan(&weight[i])
		fmt.Scan(&value[i])
	}
	dp := make([]int, v+1)
	for i := 0; i < v+1; i++ {
		dp[i] = 0
	}
	for i := 0; i < n; i++ {
		for j := weight[i]; j < v+1; j++ {
			dp[j] = int(math.Max(float64(dp[j]), float64(dp[j-weight[i]]+value[i])))
		}
	}
	fmt.Println(dp[v])
}
