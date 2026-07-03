//226. ·­×ª¶ş²æÊ÷
#include <iostream>
#include "../TreeNode.h"
using namespace std;

class Solution {
public:
  TreeNode* invertTree(TreeNode* root) {
		if(!root) return root;
		swap(root->left,root->right);
		invertTree(root->left);
		invertTree(root->right);
		return root;
  }
};

int main(){
  system("pause");
  return 0;
}
