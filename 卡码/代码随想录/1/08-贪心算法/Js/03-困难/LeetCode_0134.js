//134. 加油站
const canCompleteCircuit = function(gas, cost) {
	let start=0,current=0,total=0;
	for(let i=0;i<gas.length;i++){
		current+=(gas[i]-cost[i]);
		total+=(gas[i]-cost[i]);
		if(current<0){
			current=0;
			start=i+1;
		}
	}
	if(total<0) return -1;
	return start;
};