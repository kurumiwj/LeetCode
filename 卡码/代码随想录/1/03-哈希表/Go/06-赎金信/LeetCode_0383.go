//383. 赎金信
package main

func canConstruct(ransomNote string, magazine string) bool {
	hash:=make([]int,26)
	//解密字符串长度不够一定为false
	if len(ransomNote)>len(magazine) {
		return false
	}
	//先将解密字符串所有字符统计到数组里
	for _,ch:=range magazine {
		hash[ch-'a']++
	}
	for _,ch:=range ransomNote {
		hash[ch-'a']--
		//如果小于0说明原字符串有的解密字符串没有
		if hash[ch-'a']<0 {
			return false
		}
	}
	return true
}
