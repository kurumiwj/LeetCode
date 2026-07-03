//20. 有效的括号
const isValid = function(s) {
  if(s.length%2!=0) return false;
  let stack=new Array();
  for(let ch of s){
    if(ch=="(") stack.push(")");
    else if(ch=="[") stack.push("]");
    else if(ch=="{") stack.push("}");
    else if(stack.length==0||stack[stack.length-1]!=ch) return false;
    else stack.pop();
  }
  return stack.length==0;
};