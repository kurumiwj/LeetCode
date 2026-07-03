//968. 监控二叉树
import TreeNode from "../TreeNode.js"

/*
0:无覆盖
1:有摄像头
2:有覆盖
*/
const minCameraCover = function(root) {
	let res=0;
	const traversal=root=>{
		if(!root) return 2;
		const left=traversal(root.left);
		const right=traversal(root.right);
		if(left==2&&right==2) return 0;
		else if(left==0||right==0){
			res++;
			return 1;
		}else if(left==1||right==1){
			return 2;
		}
	}
	if(traversal(root)==0) res++;
	return res;
};