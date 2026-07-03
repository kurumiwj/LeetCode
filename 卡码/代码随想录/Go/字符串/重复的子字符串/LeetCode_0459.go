// 459. 重复的子字符串
package main

import "strings"

func repeatedSubstringPattern(s string) bool {
	n:=len(s)
	//法一
	// s1:=s+s
	// return strings.Contains(s1[1:2*n-1],s)
	//法二
	next:=make([]int,n)
	j:=0
	next[0]=0
	for i:=1;i<n;i++ {
		for j>0&&s[i]!=s[j] {
			j=next[j-1]
		}
		if s[i]==s[j] {
			j++
		}
		next[i]=j
	}
	return next[n-1]!=0&&n%(n-next[n-1])==0
}
