//7. 平均绩点
package main

import (
	"bufio"
	"fmt"
	"os"
	"strings"
)

func main(){
	reader:=bufio.NewReader(os.Stdin)
	score:=map[string]int{"A":4,"B":3,"C":2,"D":1,"F":0}
	for {
		var isUnknown=false
		line,_,err:=reader.ReadLine()
		if err!=nil {
			return
		}
		grades:=strings.Fields(string(line))
		var sum int
		for _,grade:=range grades {
			value,ok:=score[grade]
			if !ok {
				isUnknown=true
				fmt.Println("Unknown")
				break
			}
			sum+=value
		}
		if !isUnknown {
			fmt.Printf("%.2f\n",float64(sum)/float64(len(grades)))
		}
	}
}
