//112. 路径总和
#include <iostream>
#include "../TreeNode.h"
using namespace std;

class Solution {
public:
  bool hasPathSum(TreeNode* root, int targetSum) {
		if(!root) return false;
		//如果当前节点是叶子节点且目标和与叶子节点值相等则找到路径
		if(!root->left&&!root->right&&targetSum==root->val) return true;
		return hasPathSum(root->left,targetSum-root->val)||hasPathSum(root->right,targetSum-root->val);
  }
};

int main(){
  system("pause");
  return 0;
}
