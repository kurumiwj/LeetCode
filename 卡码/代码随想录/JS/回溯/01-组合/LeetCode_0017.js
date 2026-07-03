//17. 电话号码的字母组合
const letterCombinations = function(digits) {
  const nums=["","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"];
  const res=new Array();
  const backtracking=function(digits,index,str){
    if(index==digits.length){
      res.push(str);
      return;
    }
    const digit=digits.charAt(index);
    const letter=nums[digit-'0'];
    for(let i=0;i<letter.length;i++){
      backtracking(digits,index+1,str+letter[i]);
    }
  }
  if(digits.length!=0) backtracking(digits,0,"");
  return res;
};