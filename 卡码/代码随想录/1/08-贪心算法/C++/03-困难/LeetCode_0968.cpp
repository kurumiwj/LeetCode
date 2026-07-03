//968. 监控二叉树
#include <iostream>
#include "./TreeNode.h"
using namespace std;

/*
 * 0:无覆盖
 * 1:有摄像头
 * 2:有覆盖
 * */
class Solution {
	int res=0;
public:
	int traversal(TreeNode* root){
		if(!root) return 2;
		int left=traversal(root->left);
		int right=traversal(root->right);
		if(left==2&&right==2) return 0;
		else if(left==0||right==0){
			res++;
			return 1;
		}
		else if(left==1||right==1) return 2;
		return -1;
	}
	int minCameraCover(TreeNode* root) {
		if(traversal(root)==0) res++;
		return res;
	}
};

int main(){
  system("pause");
  return 0;
}
