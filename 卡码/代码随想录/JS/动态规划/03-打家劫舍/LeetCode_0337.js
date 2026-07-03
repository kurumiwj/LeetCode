//337. 打家劫舍 III
function TreeNode(val, left, right) {
	this.val = (val===undefined ? 0 : val)
	this.left = (left===undefined ? null : left)
	this.right = (right===undefined ? null : right)
}

const rob = function(root) {
	const traversal=root=>{
		if(!root) return new Array(0,0);
		const left=traversal(root.left);
		const right=traversal(root.right);
		//不偷
		const v0=Math.max(left[0],left[1])+Math.max(right[0],right[1]);
		//偷
		const v1=left[0]+right[0]+root.val;
		return new Array(v0,v1);
	}
	const res=traversal(root);
	return Math.max(res[0],res[1]);
};
