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
	var bfs func(x, y int)
	bfs = func(x, y int) {
		grid[x][y] = 0
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
				if grid[nextX][nextY] == 1 {
					cnt++
					grid[nextX][nextY] = 0
					q = append(q, [2]int{nextX, nextY})
				}
			}
		}
	}
	for i := 0; i < n; i++ {
		for j := 0; j < m; j++ {
			if grid[i][j] == 1 {
				cnt = 1
				bfs(i, j)
				res = max(res, cnt)
			}
		}
	}
	return res
}
