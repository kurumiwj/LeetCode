//LCR 182. 动态口令
package main

func dynamicPassword(password string, target int) string {
	n:=len(password)
	chs:=[]byte(password)
	reverse(chs,0,target-1)
	reverse(chs,target,n-1)
	reverse(chs,0,n-1)
	return string(chs)
}

func reverse(chs []byte,start,end int){
	for start<end {
		chs[start],chs[end]=chs[end],chs[start]
		start++
		end--
	}
}
