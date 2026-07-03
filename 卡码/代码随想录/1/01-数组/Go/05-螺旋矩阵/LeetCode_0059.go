//59. 螺旋矩阵 II
package main

import (
	"fmt"
)

func printNums(nums [][]int){
	for i:=0;i<len(nums);i++ {
		for j:=0;j<len(nums);j++ {
			fmt.Print(nums[i][j]," ")
		}
		fmt.Println()
	}
}

func generateMatrix(n int) [][]int {
	startX,startY:=0,0
	offset,count:=1,1
	nums:=make([][]int,n)
	for i:=0;i<n;i++ {
		nums[i]=make([]int,n)
	}
	var i,j int
	for k:=0;k<n/2;k++ {
		i,j=startX,startY
		for j=startY;j<n-offset;j++ {
			nums[i][j]=count
			count++
		}
		for i=startX;i<n-offset;i++ {
			nums[i][j]=count
			count++
		}
		for ;j>startY;j-- {
			nums[i][j]=count
			count++
		}
		for ;i>startX;i-- {
			nums[i][j]=count
			count++
		}
		startX++
		startY++
		offset++
	}
	if n%2!=0 {
		nums[n/2][n/2]=count
	}
	return nums
}

func main(){
	printNums(generateMatrix(5))
}
