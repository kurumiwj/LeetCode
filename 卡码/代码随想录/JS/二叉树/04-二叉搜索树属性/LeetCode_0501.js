//501. 二叉搜索树中的众数
import TreeNode from "../TreeNode.js";

const findMode = function(root) {
  let pre=null;
  let res=new Array();
  let cnt=0,maxCnt=0;
  const traversal=root=>{
    if(!root) return;
    traversal(root.left);
    if(!pre||pre.val!=root.val) cnt=1;
    else cnt++;
    pre=root;
    if(cnt==maxCnt) res.push(root.val);
    else if(cnt>maxCnt){
      maxCnt=cnt;
      res=[root.val];
    }
    traversal(root.right);
    return;
  };
  traversal(root);
  return res;
};