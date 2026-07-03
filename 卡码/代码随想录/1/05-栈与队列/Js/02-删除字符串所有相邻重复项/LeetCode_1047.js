//1047. 删除字符串中的所有相邻重复项
const removeDuplicates = function(s) {
  const stack=new Array();
  for(let ch of s){
    if(stack.length==0||stack[stack.length-1]!=ch) stack.push(ch);
    else stack.pop();
  }
  return stack.join("");
};