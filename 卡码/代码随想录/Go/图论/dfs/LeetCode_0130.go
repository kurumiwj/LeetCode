// 130. 被围绕的区域
package main

func solve(board [][]byte) {
	n, m := len(board), len(board[0])
	dir := [2][4]int{[4]int{0, 1, 0, -1}, [4]int{1, 0, -1, 0}}
	var dfs func(x, y int)
	dfs = func(x, y int) {
		board[x][y] = 'Y'
		for i := 0; i < 4; i++ {
			x1 := x + dir[0][i]
			y1 := y + dir[1][i]
			if x1 < 0 || x1 > n-1 || y1 < 0 || y1 > m-1 {
				continue
			}
			if board[x1][y1] == 'O' {
				dfs(x1, y1)
			}
		}
	}
	for i := 0; i < n; i++ {
		if board[i][0] == 'O' {
			dfs(i, 0)
		}
		if board[i][m-1] == 'O' {
			dfs(i, m-1)
		}
	}
	for j := 0; j < m; j++ {
		if board[0][j] == 'O' {
			dfs(0, j)
		}
		if board[n-1][j] == 'O' {
			dfs(n-1, j)
		}
	}
	for i := 0; i < n; i++ {
		for j := 0; j < m; j++ {
			if board[i][j] == 'O' {
				board[i][j] = 'X'
			}
			if board[i][j] == 'Y' {
				board[i][j] = 'O'
			}
		}
	}
}
