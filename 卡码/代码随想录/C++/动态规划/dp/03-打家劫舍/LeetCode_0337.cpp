//337. 打家劫舍 III
#include <iostream>
#include <vector>
using namespace std;

struct TreeNode {
	int val;
	TreeNode *left;
	TreeNode *right;
	TreeNode() : val(0), left(nullptr), right(nullptr) {}
	TreeNode(int x) : val(x), left(nullptr), right(nullptr) {}
	TreeNode(int x, TreeNode *left, TreeNode *right) : val(x), left(left), right(right) {}
};

class Solution {
public:
	vector<int> traversal(TreeNode* root){
		if(!root) return vector<int>{0,0};
		vector<int> left=traversal(root->left);
		vector<int> right=traversal(root->right);
		//不偷
		int v0=max(left[0],left[1])+max(right[0],right[1]);
		//偷
		int v1=root->val+left[0]+right[0];
		return {v0,v1};
	}
	int rob(TreeNode* root) {
		vector<int> res=traversal(root);
		return max(res[0],res[1]);
	}
};

int main(){
  system("pause");
  return 0;
}
