// 463. 岛屿的周长
func islandPerimeter(grid [][]int) int {
	dir := [2][4]int{[4]int{0, 1, 0, -1}, [4]int{1, 0, -1, 0}}
	n, m := len(grid), len(grid[0])
	res := 0
	for i := 0; i < n; i++ {
		for j := 0; j < m; j++ {
			if grid[i][j] == 1 {
				for k := 0; k < 4; k++ {
					x, y := i+dir[0][k], j+dir[1][k]
					if x < 0 || x > n-1 || y < 0 || y > m-1 || grid[x][y] == 0 {
						res++
					}
				}
			}
		}
	}
	return res
}