//530. 二叉搜索树的最小绝对差
#include <iostream>
#include "../TreeNode.h"
using namespace std;

class Solution {
	TreeNode* pre=nullptr;
	int res=INT_MAX;
public:
	void traversal(TreeNode* root){
		if(!root) return;
		traversal(root->left);
		if(pre) res=min(res,root->val-pre->val);
		pre=root;
		traversal(root->right);
	}
  int getMinimumDifference(TreeNode* root) {
		traversal(root);
		return res;
  }
};

int main(){
  system("pause");
  return 0;
}
