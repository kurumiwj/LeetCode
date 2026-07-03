// 84. 柱状图中最大的矩形
package main

import (
	"math"
)

func max(a, b int) int {
	if a > b {
		return a
	} else {
		return b
	}
}

func largestRectangleArea(heights []int) int {
	res := 0
	newHeights := make([]int, len(heights)+2)
	for i := 0; i < len(heights); i++ {
		newHeights[i+1] = heights[i]
	}
	st := make([]int, 0)
	for i, height := range newHeights {
		for len(st) > 0 && height < newHeights[st[len(st)-1]] {
			mid := st[len(st)-1]
			st = st[:len(st)-1]
			h := newHeights[mid]
			w := i - st[len(st)-1] - 1
			res = max(res, h*w)
		}
		st = append(st, i)
	}
	return res
}
