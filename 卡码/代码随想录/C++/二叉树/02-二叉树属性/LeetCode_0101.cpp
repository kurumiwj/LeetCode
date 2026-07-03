//101. ¶Ô³Æ¶ş²æÊ÷
#include <iostream>
#include "../TreeNode.h"
using namespace std;

class Solution {
public:
  bool isSymmetric(TreeNode* root) {
		if(root==nullptr) return true;
		return compare(root->left,root->right);
  }
  bool compare(TreeNode* left,TreeNode* right){
		if(left!=nullptr&&right==nullptr) return false;
		else if(left==nullptr&&right!=nullptr) return false;
		else if(left==nullptr&&right==nullptr) return true;
		else if(left->val!=right->val) return false;
		else return compare(left->left,right->right)&&compare(left->right,right->left);
	}
};

int main(){
  system("pause");
  return 0;
}
