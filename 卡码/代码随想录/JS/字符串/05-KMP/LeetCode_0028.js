//28. 找出字符串中第一个匹配项的下标
const strStr = function(haystack, needle) {
  let next=new Array(needle.length);
  let j=0;
  next[j]=0;
  for(let i=1;i<needle.length;i++){
    while(j>0&&needle[i]!=needle[j]) j=next[j-1];
    if(needle[i]==needle[j]) j++;
    next[i]=j;
  }
  j=0;
  for(let i=0;i<haystack.length;i++){
    while(j>0&&needle[j]!=haystack[i]) j=next[j-1];
    if(needle[j]==haystack[i]) j++;
    if(j==needle.length) return i-j+1;
  }
  return -1;
};