//860. 柠檬水找零
package main

func lemonadeChange(bills []int) bool {
	five,ten:=0,0
	for _,bill:=range bills {
		switch bill {
			case 5:
				five++
			case 10:
				if five>0 {
					five--
					ten++
				}else{
					return false
				}
			case 20:
				if ten>0&&five>0 {
					ten--
					five--
				}else if five>2 {
					five-=3
				}else{
					return false
				}
		}
	}
	return true
}
