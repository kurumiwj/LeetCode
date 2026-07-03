//37. 解数独
package main

func printBoard(board [][]byte){
	for i:=0;i<9;i++ {
		println(board[i])
	}
}

func solveSudoku(board [][]byte)  {
	printBoard(board)
	isValid:=func(row,col int,ch byte) bool{
		for i:=0;i<9;i++ {
			if board[row][i]==ch||board[i][col]==ch {
				return false
			}
		}
		startRow,startCol:=row/3*3,col/3*3
		for i:=startRow;i<startRow+3;i++ {
			for j:=startCol;j<startCol+3;j++ {
				if board[i][j]==ch {
					return false
				}
			}
		}
		return true
	}
	var backtracking func() bool
	backtracking=func() bool{
		for i:=0;i<9;i++ {
			for j:=0;j<9;j++ {
				if board[i][j]=='.' {
					for k:='1';k<='9';k++ {
						if isValid(i,j,byte(k)) {
							board[i][j]=byte(k)
							if backtracking() {
								return true
							}
							board[i][j]='.'
						}
					}
					return false
				}
			}
		}
		return true
	}
	backtracking()
}
