// 130. 被围绕的区域
package main

func solve(board [][]byte) {
	n, m := len(board), len(board[0])
	dir := [2][4]int{[4]int{0, 1, 0, -1}, [4]int{1, 0, -1, 0}}
	var bfs func(x, y int)
	bfs = func(x, y int) {
		board[x][y] = 'Y'
		q := make([]int, 0)
		q = append(q, x, y)
		for len(q) > 0 {
			x, y = q[0], q[1]
			q = q[2:]
			for i := 0; i < 4; i++ {
				x1 := x + dir[0][i]
				y1 := y + dir[1][i]
				if x1 < 0 || x1 > n-1 || y1 < 0 || y1 > m-1 {
					continue
				}
				if board[x1][y1] == 'O' {
					q = append(q, x1, y1)
					board[x1][y1] = 'Y'
				}
			}
		}

	}
	for i := 0; i < n; i++ {
		if board[i][0] == 'O' {
			bfs(i, 0)
		}
		if board[i][m-1] == 'O' {
			bfs(i, m-1)
		}
	}
	for j := 0; j < m; j++ {
		if board[0][j] == 'O' {
			bfs(0, j)
		}
		if board[n-1][j] == 'O' {
			bfs(n-1, j)
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
