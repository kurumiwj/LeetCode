//459. 重复的子字符串
const repeatedSubstringPattern = function(s) {
  let n=s.length;
//  //法一
//  let s1=s+s;
//  return s1.slice(1,2*n-1).includes(s);
  //法二
  let next=new Array(n);
  next[0]=0;
  let j=0;
  for(let i=1;i<n;i++){
    while(j>0&&s[i]!=s[j]) j=next[j-1];
    if(s[i]==s[j]) j++;
    next[i]=j;
  }
  return next[n-1]!=0&&n%(n-next[n-1])==0
};