//131. 分割回文串
const isPalindrome=function(s,start,end){
  while(start<end){
    if(s[start]!=s[end]) return false;
    start++;
    end--;
  }
  return true;
}
const partition = function(s) {
  const path=new Array();
  const res=new Array();
  const backtracking=function(str,index){
    if(index>=str.length){
      res.push(Array.from(path));
      return;
    }
    for(let i=index;i<str.length;i++){
      if(isPalindrome(str,index,i)) path.push(str.slice(index,i+1));
      else continue;
      backtracking(str,i+1);
      path.pop();
    }
  }
  backtracking(s,0);
  return res;
};