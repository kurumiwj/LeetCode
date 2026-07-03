//860. 柠檬水找零
const lemonadeChange = function(bills) {
	let five=0,ten=0;
	for(let bill of bills){
		switch(bill){
			case 5:
				five++;
				break;
			case 10:
				if(five>0){
					five--;
					ten++;
				}else return false;
				break;
			case 20:
				if(ten>0&&five>0){
					ten--;
					five--;
				}else if(five>2){
					five-=3;
				}else return false;
		}
	}
	return true;
};