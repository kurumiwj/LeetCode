// 797. 所有可能的路径
package main

func allPathsSourceTarget(graph [][]int) [][]int {
	res := make([][]int, 0)
	path := make([]int, 0)
	var dfs func(index int)
	dfs = func(index int) {
		if index == len(graph)-1 {
			tmp := make([]int, len(path))
			copy(tmp, path)
			res = append(res, tmp)
			return
		}
		for _, v := range graph[index] {
			path = append(path, v)
			dfs(v)
			path = path[:len(path)-1]
		}
	}
	path = append(path, 0)
	dfs(0)
	return res
}
