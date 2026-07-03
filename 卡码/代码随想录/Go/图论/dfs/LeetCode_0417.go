// 417. 太平洋大西洋水流问题
package main

func pacificAtlantic(heights [][]int) [][]int {
	dir := [2][4]int{[4]int{0, 1, 0, -1}, [4]int{1, 0, -1, 0}}
	n, m := len(heights), len(heights[0])
	visited := make([][][]bool, 2)
	for i := 0; i < 2; i++ {
		visited[i] = make([][]bool, n)
		for j := 0; j < n; j++ {
			visited[i][j] = make([]bool, m)
		}
	}
	var dfs func(x, y, flag int)
	dfs = func(x, y, flag int) {
		visited[flag][x][y] = true
		for i := 0; i < 4; i++ {
			nextX, nextY := x+dir[0][i], y+dir[1][i]
			if nextX < 0 || nextX > n-1 || nextY < 0 || nextY > m-1 {
				continue
			}
			if visited[flag][nextX][nextY] || heights[nextX][nextY] < heights[x][y] {
				continue
			}
			dfs(nextX, nextY, flag)
		}
	}
	for i := 0; i < n; i++ {
		dfs(i, 0, 0)
		dfs(i, m-1, 1)
	}
	for j := 0; j < m; j++ {
		dfs(0, j, 0)
		dfs(n-1, j, 1)
	}
	res := make([][]int, 0)
	for i := 0; i < n; i++ {
		for j := 0; j < m; j++ {
			if visited[0][i][j] && visited[1][i][j] {
				res = append(res, []int{i, j})
			}
		}
	}
	return res
}
