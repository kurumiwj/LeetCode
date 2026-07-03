//28. 找出字符串中第一个匹配项的下标
package main

func strStr(haystack string, needle string) int {
	var next=make([]int,len(needle))
	j:=0
	next[j]=0
	for i:=1;i<len(needle);i++ {
		for j>0&&needle[j]!=needle[i] {
			j=next[j-1]
		}
		if needle[j]==needle[i] {
			j++
		}
		next[i]=j
	}
	j=0
	for i:=0;i<len(haystack);i++ {
		for j>0&&needle[j]!=haystack[i] {
			j=next[j-1]
		}
		if needle[j]==haystack[i] {
			j++
		}
		if j==len(needle) {
			return i-j+1
		}
	}
	return -1
}
