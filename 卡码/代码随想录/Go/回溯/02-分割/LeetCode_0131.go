//131. 分割回文串
package main

func isPalindrome(s string,start,end int) bool{
	for start<end {
		if s[start]!=s[end] {
			return false
		}
		start++
		end--
	}
	return true
}

func partition(s string) [][]string {
	var path=make([]string,0)
	var res=make([][]string,0)
	var backtracking func(s string,index int)
	backtracking=func(s string,index int){
		if index>=len(s) {
			tmp:=make([]string,len(path))
			copy(tmp,path)
			res=append(res,tmp)
			return
		}
		for i:=index;i<len(s);i++ {
			if isPalindrome(s,index,i) {
				path=append(path,s[index:i+1])
			}else{
				continue
			}
			backtracking(s,i+1)
			path=path[:len(path)-1]
		}
	}
	backtracking(s,0)
	return res
}
