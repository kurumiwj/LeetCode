//111. 二叉树的最小深度
#include <iostream>
#include "../TreeNode.h"
using namespace std;

class Solution {
public:
  int minDepth(TreeNode* root) {
		if(root==nullptr) return 0;
		if(root->left!=nullptr&&root->right==nullptr) return 1+minDepth(root->left);
		if(root->left==nullptr&&root->right!=nullptr) return 1+minDepth(root->right);
		return 1+min(minDepth(root->left),minDepth(root->right));
  }
};

int main(){
  system("pause");
  return 0;
}
