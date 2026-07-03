// 18. 链表的基本操作(尾插法)
package main

import (
	"bufio"
	"fmt"
	"os"
	"strconv"
	"strings"
)

type Node struct{
	data int
	next *Node
}

func (this *Node) isEmpty() bool{
	if this.next==nil {
		return true
	}
	return false
}

func (this *Node) show(){
	if this.isEmpty() {
		fmt.Print("Link list is empty")
		return
	}
	tmp:=this.next
	for tmp.next!=nil {
		fmt.Printf("%d ",tmp.data)
		tmp=tmp.next
	}
	fmt.Printf("%d",tmp.data)
}

func (this *Node) get(i int) (res int,ok bool){
	//下标不合法
	if i<=0 {
		res,ok=-1,false
		return
	}
	tmp:=this
	index:=1
	for tmp.next!=nil {
		tmp=tmp.next
		//获取成功
		if index==i {
			res,ok=tmp.data,true
			return
		}
		index++
	}
	//获取失败
	res,ok=-1,false
	return
}

func (this *Node) delete(i int) bool{
	if i<=0 {
		return false
	}
	tmp:=this
	index:=1
	for tmp.next!=nil {
		//找到要删除的节点
		if index==i {
			break
		}
		index++
		tmp=tmp.next
	}
	if index!=i {
		return false
	}
	tmp.next=tmp.next.next
	return true
}

func (this *Node) insert(i int,e int) bool{
	if i<=0 {
		return false
	}
	tmp:=this
	index:=1
	for tmp.next!=nil {
		if index==i {
			break
		}
		index++
		tmp=tmp.next
	}
	if index!=i {
		return false
	}
	node:=&Node{e,tmp.next}
	tmp.next=node
	return true
}

func main(){
	var n int
	fmt.Scan(&n)
	var cur *Node
	var pre *Node
	//逆序创建链表
	for i:=0;i<n;i++ {
		var tmp int
		fmt.Scan(&tmp)
		pre=&Node{tmp,cur}
		cur=pre
	}
	//头结点
	var linkedList=&Node{-1,cur}
	var m int
	fmt.Scanf("\n%d\n",&m)
	reader:=bufio.NewReader(os.Stdin)
	for i:=0;i<m;i++ {
		line,_,_:=reader.ReadLine()
		ops:=strings.Fields(string(line))
		op:=ops[0]
		var index int
		if len(ops)>1 {
			index,_=strconv.Atoi(ops[1])
		}
		switch op {
			case "show":
				linkedList.show()
			case "get":
				num,ok:=linkedList.get(index)
				if ok {
					fmt.Print(num)
				}else{
					fmt.Print("get fail")
				}
			case "delete":
				ok:=linkedList.delete(index)
				if ok {
					fmt.Print("delete OK")
				}else{
					fmt.Print("delete fail")
				}
			case "insert":
				data,_:=strconv.Atoi(ops[2])
				ok:=linkedList.insert(index,data)
				if ok {
					fmt.Print("insert OK")
				}else{
					fmt.Print("insert fail")
				}
		}
		fmt.Println()
	}
}
