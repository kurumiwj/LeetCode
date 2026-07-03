//257. 二叉树的所有路径
#include <iostream>
#include <vector>
#include <string>
#include "../TreeNode.h"
using namespace std;

class Solution {
public:
	void traversal(TreeNode* root,string path,vector<string>& res){
		path+=to_string(root->val);
		//到达叶子节点
		if(!root->left&&!root->right){
			res.push_back(path);
			return;
		}
		if(root->left) traversal(root->left,path+"->",res);
		if(root->right) traversal(root->right,path+"->",res);
	}
  vector<string> binaryTreePaths(TreeNode* root) {
		vector<string> res;
		string path;
		if(!root) return res;
		traversal(root,path,res);
		return res;
  }
};

int main(){
  system("pause");
  return 0;
}
