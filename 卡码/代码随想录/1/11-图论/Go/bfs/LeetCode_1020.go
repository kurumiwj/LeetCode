// 1020. 飞地的数量
package main

func numEnclaves(grid [][]int) int {
	n, m := len(grid), len(grid[0])
	cnt := 0
	dir := [2][4]int{[4]int{0, 1, 0, -1}, [4]int{1, 0, -1, 0}}
	var bfs func(x, y int)
	bfs = func(x, y int) {
		grid[x][y] = 0
		cnt++
		q := make([]int, 0)
		q = append(q, x, y)
		for len(q) > 0 {
			x = q[0]
			y = q[1]
			q = q[2:]
			for i := 0; i < 4; i++ {
				x1 := x + dir[0][i]
				y1 := y + dir[1][i]
				if x1 < 0 || x1 > n-1 || y1 < 0 || y1 > m-1 {
					continue
				}
				if grid[x1][y1] == 1 {
					cnt++
					grid[x1][y1] = 0
					q = append(q, x1, y1)
				}
			}
		}
	}
	for i := 0; i < n; i++ {
		if grid[i][0] == 1 {
			bfs(i, 0)
		}
		if grid[i][m-1] == 1 {
			bfs(i, m-1)
		}
	}
	for j := 0; j < m; j++ {
		if grid[0][j] == 1 {
			bfs(0, j)
		}
		if grid[n-1][j] == 1 {
			bfs(n-1, j)
		}
	}
	cnt = 0
	for i := 0; i < n; i++ {
		for j := 0; j < m; j++ {
			if grid[i][j] == 1 {
				bfs(i, j)
			}
		}
	}
	return cnt
}
