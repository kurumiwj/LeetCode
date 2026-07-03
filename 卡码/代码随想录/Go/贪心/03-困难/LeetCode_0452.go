// 452. 用最少数量的箭引爆气球
package main

import (
	"math"
	"sort"
)

func findMinArrowShots(points [][]int) int {
	if len(points)==0 {
		return 0
	}
	arrow:=1
	sort.Slice(points,func (i,j int) bool{
		return points[i][0]<points[j][0]
	})
	for i:=1;i<len(points);i++ {
		if points[i][0]>points[i-1][1] {
			arrow++
		}else{
			points[i][1]=int(math.Min(float64(points[i][1]),float64(points[i-1][1])))
		}
	}
	return arrow
}
