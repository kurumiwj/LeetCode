// 51. N 皇后
package main

import "strings"

func solveNQueens(n int) [][]string {
	res:=make([][]string,0)
	chess:=make([][]string,n)
	var backtracking func(row int)
	var isValid func(row,col int) bool
	isValid=func(row,col int) bool{
		for i:=0;i<row;i++ {
			if chess[i][col]=="Q" {
				return false
			}
		}
		for i,j:=row-1,col-1;i>=0&&j>=0;i,j=i-1,j-1 {
			if chess[i][j]=="Q" {
				return false
			}
		}
		for i,j:=row-1,col+1;i>=0&&j<n;i,j=i-1,j+1 {
			if chess[i][j]=="Q" {
				return false
			}
		}
		return true
	}
	backtracking=func(row int){
		if row==n {
			tmp:=make([]string,n)
			for i,str:=range chess {
				tmp[i]=strings.Join(str,"")
			}
			res=append(res,tmp)
			return
		}
		for col:=0;col<n;col++ {
			if isValid(row,col) {
				chess[row][col]="Q"
				backtracking(row+1)
				chess[row][col]="."
			}
		}
	}
	for i:=0;i<n;i++ {
		chess[i]=make([]string,n)
		for j:=0;j<n;j++ {
			chess[i][j]="."
		}
	}
	backtracking(0)
	return res
}
