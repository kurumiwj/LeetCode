//739. 每日温度
const dailyTemperatures = function(temperatures) {
	const res=new Array(temperatures.length).fill(0);
	const st=new Array(0);
	for(let i=0;i<temperatures.length;i++){
		while(st.length&&temperatures[i]>temperatures[st[st.length-1]]){
			res[st[st.length-1]]=i-st[st.length-1];
			st.pop();
		}
		st.push(i);
	}
	return res;
};
