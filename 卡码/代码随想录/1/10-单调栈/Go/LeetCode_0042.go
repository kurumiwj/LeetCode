// 42. 接雨水
package main

import (
	"math"
)

func trap(height []int) int {
	res := 0
	st := make([]int, 0)
	for index, num := range height {
		for len(st) > 0 && num > height[st[len(st)-1]] {
			low := st[len(st)-1]
			st = st[:len(st)-1]
			if len(st) > 0 {
				h := int(math.Min(float64(num), float64(height[st[len(st)-1]]))) - height[low]
				w := index - st[len(st)-1] - 1
				res += h * w
			}
		}
		st = append(st, index)
	}
	return res
}
