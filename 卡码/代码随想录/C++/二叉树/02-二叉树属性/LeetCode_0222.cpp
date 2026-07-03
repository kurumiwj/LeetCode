//222. 完全二叉树的节点个数
#include <iostream>
#include "../TreeNode.h"
using namespace std;

class Solution {
public:
  int countNodes(TreeNode* root) {
		if(root==nullptr) return 0;
		TreeNode* left=root->left;
		TreeNode* right=root->right;
		int leftDepth=0,rightDepth=0;
		while(left){
			left=left->left;
			leftDepth++;
		}
		while(right){
			right=right->right;
			rightDepth++;
		}
		if(leftDepth==rightDepth) return (2<<leftDepth)-1;
		return 1+countNodes(root->left)+countNodes(root->right);
  }
};

int main(){
  system("pause");
  return 0;
}
