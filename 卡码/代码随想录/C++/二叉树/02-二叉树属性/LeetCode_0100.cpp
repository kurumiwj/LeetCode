//100. ÏàÍ¬µÄÊ÷
#include <iostream>
#include "../TreeNode.h"
using namespace std;

class Solution {
public:
  bool isSameTree(TreeNode* p, TreeNode* q) {
		if(p==nullptr&&q!=nullptr) return false;
		else if(p!=nullptr&&q==nullptr) return false;
		else if(p==nullptr&&q==nullptr) return true;
		else if(p->val!=q->val) return false;
		else return isSameTree(p->left,q->left)&&isSameTree(p->right,q->right);
  }
};

int main(){
  system("pause");
  return 0;
}
