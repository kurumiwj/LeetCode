//344. 反转字符串
package main

func reverseString(s []byte)  {
	left,right:=0,len(s)-1
	for left<right {
		s[left]^=s[right]
		s[right]^=s[left]
		s[left]^=s[right]
		left++
		right--
	}
}
