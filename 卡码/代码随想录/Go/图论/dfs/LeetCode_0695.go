// 695. 岛屿的最大面积
package main

func max(a, b int) int {
	if a > b {
		return a
	} else {
		return b
	}
}

func maxAreaOfIsland(grid [][]int) int {
	n, m := len(grid), len(grid[0])
	cnt := 1
	res := 0
	dir := [2][4]int{[4]int{0, 1, 0, -1}, [4]int{1, 0, -1, 0}}
	var dfs func(x, y int)
	dfs = func(x, y int) {
		grid[x][y] = 0
		for i := 0; i < 4; i++ {
			nextX := x + dir[0][i]
			nextY := y + dir[1][i]
			if nextX < 0 || nextX > n-1 || nextY < 0 || nextY > m-1 {
				continue
			}
			if grid[nextX][nextY] == 1 {
				cnt++
				dfs(nextX, nextY)
			}
		}
	}
	for i := 0; i < n; i++ {
		for j := 0; j < m; j++ {
			if grid[i][j] == 1 {
				cnt = 1
				dfs(i, j)
				res = max(res, cnt)
			}
		}
	}
	return res
}
