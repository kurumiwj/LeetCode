// 827. 最大人工岛
package main

func max(a, b int) int {
	if a > b {
		return a
	} else {
		return b
	}
}

func largestIsland(grid [][]int) int {
	n, m := len(grid), len(grid[0])
	dir := [2][4]int{[4]int{0, 1, 0, -1}, [4]int{1, 0, -1, 0}}
	q := make([][2]int, 0)
	var bfs func(mark int) int
	bfs = func(mark int) int {
		cnt := 1
		for len(q) > 0 {
			v := q[0]
			q = q[1:]
			for i := 0; i < 4; i++ {
				nextX, nextY := v[0]+dir[0][i], v[1]+dir[1][i]
				if nextX < 0 || nextX > n-1 || nextY < 0 || nextY > m-1 {
					continue
				}
				if grid[nextX][nextY] == 0 || grid[nextX][nextY] > 1 {
					continue
				}
				q = append(q, [2]int{nextX, nextY})
				grid[nextX][nextY] = mark
				cnt++
			}
		}
		return cnt
	}
	mark := 2
	isAllLand := true
	areas := make(map[int]int)
	for i := 0; i < n; i++ {
		for j := 0; j < m; j++ {
			if grid[i][j] == 0 {
				isAllLand = false
			}
			if grid[i][j] == 1 {
				q = append(q, [2]int{i, j})
				grid[i][j] = mark
				cnt := bfs(mark)
				areas[mark] = cnt
				mark++
			}
		}
	}
	if isAllLand {
		return n * m
	}
	res := 0
	visited := make(map[int]bool)
	for i := 0; i < n; i++ {
		for j := 0; j < m; j++ {
			if grid[i][j] == 0 {
				cnt := 1
				visited = make(map[int]bool)
				for k := 0; k < 4; k++ {
					nextX, nextY := i+dir[0][k], j+dir[1][k]
					if nextX < 0 || nextX > n-1 || nextY < 0 || nextY > m-1 {
						continue
					}
					if _, ok := visited[grid[nextX][nextY]]; ok {
						continue
					}
					visited[grid[nextX][nextY]] = true
					cnt += areas[grid[nextX][nextY]]
				}
				res = max(res, cnt)
			}
		}
	}
	return res
}
