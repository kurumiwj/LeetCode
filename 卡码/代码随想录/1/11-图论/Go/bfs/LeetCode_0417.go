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
	q := make([][3]int, 0)
	var bfs func()
	bfs = func() {
		for len(q) > 0 {
			v := q[0]
			q = q[1:]
			for i := 0; i < 4; i++ {
				nextX, nextY := v[1]+dir[0][i], v[2]+dir[1][i]
				if nextX < 0 || nextX > n-1 || nextY < 0 || nextY > m-1 {
					continue
				}
				if visited[v[0]][nextX][nextY] || heights[nextX][nextY] < heights[v[1]][v[2]] {
					continue
				}
				q = append(q, [3]int{v[0], nextX, nextY})
				visited[v[0]][nextX][nextY] = true
			}
		}
	}
	for i := 0; i < n; i++ {
		visited[0][i][0] = true
		visited[1][i][m-1] = true
		q = append(q, [3]int{0, i, 0})
		q = append(q, [3]int{1, i, m - 1})
	}
	for j := 0; j < m; j++ {
		visited[0][0][j] = true
		visited[1][n-1][j] = true
		q = append(q, [3]int{0, 0, j})
		q = append(q, [3]int{1, n - 1, j})
	}
	bfs()
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
