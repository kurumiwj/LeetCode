//150. 逆波兰表达式求值
const evalRPN = function(tokens) {
  const nums=new Array();
  let n1,n2;
  for(let token of tokens){
    if(token=="+"||token=="-"||token=="*"||token=="/"){
      n2=nums.pop();
      n1=nums.pop();
    }
    switch(token){
      case "+":
        nums.push(n1+n2);
        break;
      case "-":
        nums.push(n1-n2);
        break;
      case "*":
        nums.push(n1*n2);
        break;
      case "/":
        let num=n1/n2;
        nums.push(num>0 ? Math.floor(num) : Math.ceil(num));
        break;
      default:
        nums.push(Number(token));
    }
  }
  return nums[nums.length-1];
};