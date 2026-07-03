//383. 赎金信
const canConstruct = function(ransomNote, magazine) {
  if(ransomNote.length>magazine.length) return false;
  let hash=new Array(26).fill(0);
  for(let i=0;i<magazine.length;i++)
    hash[magazine.charCodeAt(i)-'a'.charCodeAt(0)]++;
  for(let i=0;i<ransomNote.length;i++){
    let ch=ransomNote.charCodeAt(i)-'a'.charCodeAt(0);
    hash[ch]--;
    if(hash[ch]<0) return false;
  }
  return true;
};
