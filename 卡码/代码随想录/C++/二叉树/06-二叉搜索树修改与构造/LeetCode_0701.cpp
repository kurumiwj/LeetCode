//701. 二叉搜索树中的插入操作
#include <iostream>
#include "../TreeNode.h"
using namespace std;

class Solution {
public:
  TreeNode* insertIntoBST(TreeNode* root, int val) {
		if(!root) return new TreeNode(val);
		if(root->val>val) root->left=insertIntoBST(root->left,val);
		else if(root->val<val) root->right=insertIntoBST(root->right,val);
		return root;
  }
};

int main(){
  system("pause");
  return 0;
}
