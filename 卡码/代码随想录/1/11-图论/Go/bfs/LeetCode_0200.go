// 200. 岛屿数量
package main

func numIslands(grid [][]byte) int {
	dir := [][]int{[]int{0, 1, 0, -1}, []int{1, 0, -1, 0}}
	n, m := len(grid), len(grid[0])
	res := 0
	var bfs func(x, y int)
	bfs = func(x, y int) {
		grid[x][y] = '0'
		q := make([][2]int, 0)
		q = append(q, [2]int{x, y})
		for len(q) > 0 {
			v := q[0]
			q = q[1:]
			for i := 0; i < 4; i++ {
				nextX := v[0] + dir[0][i]
				nextY := v[1] + dir[1][i]
				if nextX < 0 || nextX > n-1 || nextY < 0 || nextY > m-1 {
					continue
				}
				if grid[nextX][nextY] == '1' {
					grid[nextX][nextY] = '0'
					q = append(q, [2]int{nextX, nextY})
				}
			}
		}
	}
	for i := 0; i < n; i++ {
		for j := 0; j < m; j++ {
			if grid[i][j] == '1' {
				res++
				bfs(i, j)
			}
		}
	}
	return res
}
