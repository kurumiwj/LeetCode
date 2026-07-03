//541. 反转字符串 II
const reverseStr = function(s, k) {
  let ch=Array.from(s);
  for(let i=0;i<ch.length;i+=2*k){
    let start=i-1,end=Math.min(i+k,ch.length);
    while(++start<--end) [ch[start],ch[end]]=[ch[end],ch[start]];
  }
  return ch.join("");
};