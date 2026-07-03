//242. 有效的字母异位词
const isAnagram=(s,t)=>{
  let hash=new Array(26).fill(0);
  for(let ch of s)
    hash[ch.codePointAt(0)-'a'.codePointAt(0)]++;
  for(let ch of t)
    hash[ch.codePointAt(0)-'a'.codePointAt(0)]--;
  for(let num of hash)
    if(num!=0) return false;
  return true;
}