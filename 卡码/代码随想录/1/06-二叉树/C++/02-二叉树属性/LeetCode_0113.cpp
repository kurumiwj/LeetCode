//113. 路径总和 II
#include <iostream>
#include <vector>
#include "../TreeNode.h"
using namespace std;

class Solution {
	vector<vector<int>> res;
	vector<int> path;
public:
  vector<vector<int>> pathSum(TreeNode* root, int targetSum) {
		traversal(root,targetSum);
		return res;
  }
  void traversal(TreeNode* root,int targetSum){
		if(!root) return;
		path.push_back(root->val);
		targetSum-=root->val;
		//叶子节点且sum减到0说明找到路径
		if(!root->left&&!root->right&&targetSum==0) res.push_back(path);
		traversal(root->left,targetSum);
		traversal(root->right,targetSum);
		path.pop_back();
	}
};

int main(){
  system("pause");
  return 0;
}
