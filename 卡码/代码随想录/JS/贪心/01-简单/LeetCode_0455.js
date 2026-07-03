//455. 分发饼干
const findContentChildren = function(g, s) {
  g.sort((a,b)=>a-b);
  s.sort((a,b)=>a-b);
  let res=0,index=s.length-1;
  for(let i=g.length-1;i>=0;i--){
    if(index<0) break;
    if(s[index]>=g[i]){
      res++;
      index--;
    }
  }
  return res;
};