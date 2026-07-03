//637. 二叉树的层平均值
#include <iostream>
#include <vector>
#include <queue>
#include "../TreeNode.h"
using namespace std;

class Solution {
public:
  vector<double> averageOfLevels(TreeNode* root) {
		vector<double> res;
		queue<TreeNode*> q;
		int size;
		double sum;
		if(root) q.push(root);
		while(!q.empty()){
			size=q.size();
			sum=0;
			for(int i=0;i<size;i++){
				TreeNode* node=q.front();
				q.pop();
				sum+=node->val;
				if(node->left) q.push(node->left);
				if(node->right) q.push(node->right);
			}
			res.push_back(sum*1.0/size);
		}
		return res;
  }
};

int main(){
  system("pause");
  return 0;
}
