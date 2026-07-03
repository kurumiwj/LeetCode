//59. 螺旋矩阵 II
var generateMatrix = function(n) {
  let startX=0,startY=0,count=1,offset=1,mid=Math.floor(n/2),loop=mid;
  let nums=new Array(n).fill(0).map(item=>new Array(n));
  while(loop--){
    let i=startX,j=startY;
    for(j=startY;j<n-offset;j++) nums[i][j]=count++;
    for(i=startX;i<n-offset;i++) nums[i][j]=count++;
    for(;j>startY;j--) nums[i][j]=count++;
    for(;i>startX;i--) nums[i][j]=count++;
    startX++,startY++,offset++;
  }
  if(n%2) nums[mid][mid]=count;
  return nums;
};

void function(){
  console.log(generateMatrix(5));
}();