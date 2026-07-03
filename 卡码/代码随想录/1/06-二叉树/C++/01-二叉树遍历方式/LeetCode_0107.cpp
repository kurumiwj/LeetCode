//107. ¶ş²æÊ÷µÄ²ãĞò±éÀú II
#include <iostream>
#include <vector>
#include <queue>
#include <algorithm>
#include "../TreeNode.h"
using namespace std;

class Solution {
public:
  vector<vector<int>> levelOrderBottom(TreeNode* root) {
		queue<TreeNode*> q;
		vector<vector<int>> res;
		vector<int> v;
		if(root) q.push(root);
		int size;
		while(!q.empty()){
			size=q.size();
			v.clear();
			while(size-->0){
				TreeNode *node=q.front();
				q.pop();
				v.push_back(node->val);
				if(node->left) q.push(node->left);
				if(node->right) q.push(node->right);
			}
			res.push_back(v);
		}
		reverse(res.begin(),res.end());
		return res;
  }
};

int main(){
  system("pause");
  return 0;
}
