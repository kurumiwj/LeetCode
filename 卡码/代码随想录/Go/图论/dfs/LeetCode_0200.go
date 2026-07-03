// 200. 岛屿数量
package main

func numIslands(grid [][]byte) int {
	dir := [][]int{[]int{0, 1, 0, -1}, []int{1, 0, -1, 0}}
	n, m := len(grid), len(grid[0])
	res := 0
	var dfs func(x, y int)
	dfs = func(x, y int) {
		grid[x][y] = '0'
		for i := 0; i < 4; i++ {
			nextX := x + dir[0][i]
			nextY := y + dir[1][i]
			if nextX < 0 || nextX > n-1 || nextY < 0 || nextY > m-1 {
				continue
			}
			if grid[nextX][nextY] == '1' {
				dfs(nextX, nextY)
			}
		}
	}
	for i := 0; i < n; i++ {
		for j := 0; j < m; j++ {
			if grid[i][j] == '1' {
				res++
				dfs(i, j)
			}
		}
	}
	return res
}
