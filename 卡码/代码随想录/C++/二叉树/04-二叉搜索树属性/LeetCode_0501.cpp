//501. 二叉搜索树中的众数
#include <iostream>
#include <vector>
#include "../TreeNode.h"
using namespace std;

class Solution {
	TreeNode* pre=nullptr;
	vector<int> res;
	int count=0;
	int maxCount=0;
public:
	void traversal(TreeNode* root){
		if(!root) return;
		traversal(root->left);
		if(!pre) count=1;
		else if(pre->val==root->val) count++;
		else count=1;
		pre=root;
		if(count==maxCount) res.push_back(root->val);
		else if(count>maxCount){
			maxCount=count;
			res.clear();
			res.push_back(root->val);
		}
		traversal(root->right);
		return;
	}
  vector<int> findMode(TreeNode* root) {
		traversal(root);
		return res;
  }
};

int main(){
  system("pause");
  return 0;
}
