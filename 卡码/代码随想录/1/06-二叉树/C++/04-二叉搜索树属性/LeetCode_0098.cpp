//98. ÑéÖ¤¶ş²æËÑË÷Ê÷
#include <iostream>
#include "../TreeNode.h"
using namespace std;

class Solution {
	TreeNode* pre=nullptr;
public:
  bool isValidBST(TreeNode* root) {
		if(!root) return true;
		bool left=isValidBST(root->left);
		if(pre!=nullptr&&pre->val>=root->val) return false;
		pre=root;
		bool right=isValidBST(root->right);
		return left&&right;
  }
};

int main(){
  system("pause");
  return 0;
}
