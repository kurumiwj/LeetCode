// 14. 句子缩写
package main

import (
	"bufio"
	"fmt"
	"os"
	"strings"
)

func main(){
	var n int
	_,err:=fmt.Scanln(&n)
	if err!=nil {
		return
	}
	reader:=bufio.NewReader(os.Stdin)
	for i:=0;i<n;i++ {
		line,_,_:=reader.ReadLine()
		words:=strings.Fields(string(line))
		var res string
		for _,word:=range words {
			res+=word[:1]
		}
		fmt.Println(strings.ToUpper(res))
	}
}
