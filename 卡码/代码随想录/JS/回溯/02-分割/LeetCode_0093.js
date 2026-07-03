//93. 复原 IP 地址
const isValid=function(s,start,end){
  if(start>end||s[start]=="0"&&start!=end) return false;
  let num=0;
  const digit=parseInt(s.slice(start,end+1));
  if(digit>255) return false;
  return true;
}
const restoreIpAddresses = function(s) {
  const res=new Array();
  const path=new Array();
  const backtracking=function(s,index,dotNum){
    if(index==s.length&&dotNum==4){
      res.push(path.join("."));
      return;
    }
    for(let i=index;i<s.length&&i-index<3;i++){
      if(isValid(s,index,i)){
        path.push(s.slice(index,i+1));
        backtracking(s,i+1,dotNum+1);
        path.pop();
      }else break;
    }
  }
  backtracking(s,0,0);
  return res;
};