//96. 不同的二叉搜索树
package main

func numTrees(n int) int {
	dp:=make([]int,n+1)
	for i:=0;i<n+1;i++ {
		dp[i]=0
	}
	dp[0]=1
	for i:=1;i<n+1;i++ {
		for j:=1;j<=i;j++ {
			dp[i]+=dp[j-1]*dp[i-j]
		}
	}
	return dp[n]
}
