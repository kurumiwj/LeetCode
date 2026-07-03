// 541. 反转字符串 II
package main

import "math"

func reverseStr(s string, k int) string {
	ch:=[]byte(s)
	for i:=0;i<len(ch);i+=2*k {
		start:=i
		end:=int(math.Min(float64(start+k-1),float64(len(ch)-1)))
		for start<end {
			ch[start]^=ch[end]
			ch[end]^=ch[start]
			ch[start]^=ch[end]
			start++
			end--
		}
	}
	return string(ch)
}
