// 1020. 飞地的数量
package main

func numEnclaves(grid [][]int) int {
	n, m := len(grid), len(grid[0])
	cnt := 0
	dir := [2][4]int{[4]int{0, 1, 0, -1}, [4]int{1, 0, -1, 0}}
	var dfs func(x, y int)
	dfs = func(x, y int) {
		grid[x][y] = 0
		cnt++
		for i := 0; i < 4; i++ {
			x1 := x + dir[0][i]
			y1 := y + dir[1][i]
			if x1 < 0 || x1 > n-1 || y1 < 0 || y1 > m-1 {
				continue
			}
			if grid[x1][y1] == 1 {
				dfs(x1, y1)
			}
		}
	}
	for i := 0; i < n; i++ {
		if grid[i][0] == 1 {
			dfs(i, 0)
		}
		if grid[i][m-1] == 1 {
			dfs(i, m-1)
		}
	}
	for j := 0; j < m; j++ {
		if grid[0][j] == 1 {
			dfs(0, j)
		}
		if grid[n-1][j] == 1 {
			dfs(n-1, j)
		}
	}
	cnt = 0
	for i := 0; i < n; i++ {
		for j := 0; j < m; j++ {
			if grid[i][j] == 1 {
				dfs(i, j)
			}
		}
	}
	return cnt
}
