//242. 有效的字母异位词
package main

func isAnagram(s string, t string) bool {
	hash:=make([]int,26)
	for _,ch:=range s {
		hash[ch-'a']++
	}
	for _,ch:=range t {
		hash[ch-'a']--
	}
	for _,num:=range hash {
		if num!=0 {
			return false
		}
	}
	return true
}
