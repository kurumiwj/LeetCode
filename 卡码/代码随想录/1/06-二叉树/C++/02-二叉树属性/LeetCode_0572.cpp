//572. ÁíÒ»¿ÃÊ÷µÄ×ÓÊ÷
#include <iostream>
#include "../TreeNode.h"
using namespace std;

class Solution {
public:
	bool compare(TreeNode* left,TreeNode* right){
		if(left==nullptr&&right!=nullptr) return false;
		else if(left!=nullptr&&right==nullptr) return false;
		else if(left==nullptr&&right==nullptr) return true;
		else if(left->val!=right->val) return false;
		else return compare(left->left,right->left)&&compare(left->right,right->right);
	}
  bool isSubtree(TreeNode* root, TreeNode* subRoot) {
		if(root==nullptr) return false;
		else return compare(root,subRoot)||isSubtree(root->left,subRoot)||isSubtree(root->right,subRoot);
  }
};

int main(){
  system("pause");
  return 0;
}
