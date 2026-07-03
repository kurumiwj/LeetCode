// 435. 无重叠区间
package main

import (
	"math"
	"sort"
)

func eraseOverlapIntervals(intervals [][]int) int {
	if len(intervals)==0 {
		return 0
	}
	sort.Slice(intervals,func (i,j int) bool{
		return intervals[i][0]<intervals[j][0]
	})
	res:=0
	for i:=1;i<len(intervals);i++ {
		if intervals[i][0]<intervals[i-1][1] {
			res++
			intervals[i][1]=int(math.Min(float64(intervals[i][1]),float64(intervals[i-1][1])))
		}
	}
	return res
}
