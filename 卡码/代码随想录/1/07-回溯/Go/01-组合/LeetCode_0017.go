//17. 电话号码的字母组合
package main

func letterCombinations(digits string) []string {
	var nums=[]string{"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"}
	res:=make([]string,0)
	var backtracking func(digits,str string,index int)
	backtracking=func(digits,str string,index int){
		if index==len(digits) {
			res=append(res,str)
			return
		}
		digit:=digits[index]-'0'
		letter:=nums[digit]
		for i:=0;i<len(letter);i++ {
			backtracking(digits,str+string(letter[i]),index+1)
		}
	}
	if len(digits)!=0 {
		backtracking(digits,"",0)
	}
	return res
}
