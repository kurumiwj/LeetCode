//515. 在每个树行中找最大值
#include <iostream>
#include <vector>
#include <queue>
#include "../TreeNode.h"
using namespace std;

class Solution {
public:
  vector<int> largestValues(TreeNode* root) {
		vector<int> res;
		queue<TreeNode*> q;
		int size;
		if(root) q.push(root);
		while(!q.empty()){
			size=q.size();
			int maxVal=q.front()->val;
			while(size-->0){
				TreeNode* node=q.front();
				maxVal=node->val>maxVal ? node->val : maxVal;
				q.pop();
				if(node->left) q.push(node->left);
				if(node->right) q.push(node->right);
			}
			res.push_back(maxVal);
		}
		return res;
  }
};

int main(){
  system("pause");
  return 0;
}
