//127. 单词接龙
const ladderLength = function(beginWord, endWord, wordList) {
  const visited=new Set();
  const wordSet=new Set(wordList);
  if(!wordSet.has(endWord)) return 0;
  const q=new Array();
  let path=1;
  q.push(beginWord);
  const changeLetter=(word)=>{
    for(let i=0;i<word.length;i++){
      for(let ch="a".charCodeAt(0);ch<="z".charCodeAt(0);ch++){
        const newWord=word.slice(0,i)+String.fromCharCode(ch)+word.slice(i+1);
        if(endWord==newWord) return true;
        if(wordSet.has(newWord)&&!visited.has(newWord)){
          visited.add(newWord);
          q.push(newWord);
        }
      }
    }
    return false;
  }
  while(q.length>0){
    const size=q.length;
    for(let i=0;i<size;i++){
      const word=q.shift();
      if(changeLetter(word)) return path+1;
    }
    path++;
  }
  return 0;
};
