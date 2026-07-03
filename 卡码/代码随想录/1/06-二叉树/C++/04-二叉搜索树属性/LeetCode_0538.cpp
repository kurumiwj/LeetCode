//538. 把二叉搜索树转换为累加树
#include <iostream>
#include "../TreeNode.h"
using namespace std;

class Solution {
	int pre;
public:
	void traversal(TreeNode* root){
		if(!root) return;
		traversal(root->right);
		root->val+=pre;
		pre=root->val;
		traversal(root->left);
	}
  TreeNode* convertBST(TreeNode* root) {
		pre=0;
		traversal(root);
		return root;
  }
};

int main(){
  system("pause");
  return 0;
}
