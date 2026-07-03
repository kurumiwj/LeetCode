// 151. 反转字符串中的单词
package main

import "strings"

func reverseWords(s string) string {
	str:=strings.TrimSpace(s)
	strs:=strings.Fields(str)
	for i:=0;i<len(strs)/2;i++ {
		strs[i],strs[len(strs)-1-i]=strs[len(strs)-1-i],strs[i]
	}
	return strings.Join(strs," ")
}

