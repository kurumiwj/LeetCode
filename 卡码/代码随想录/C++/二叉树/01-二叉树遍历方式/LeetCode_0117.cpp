//117. 填充每个节点的下一个右侧节点指针
#include <iostream>
#include <queue>
using namespace std;

class Node {
public:
  int val;
  Node* left;
  Node* right;
  Node* next;
  Node() : val(0), left(NULL), right(NULL), next(NULL) {}
  Node(int _val) : val(_val), left(NULL), right(NULL), next(NULL) {}
  Node(int _val, Node* _left, Node* _right, Node* _next):val(_val), left(_left), right(_right), next(_next) {}
};

class Solution {
public:
  Node* connect(Node* root) {
  	queue<Node*> q;
  	int size=0;
  	Node *cur,*prev;
  	if(root) q.push(root);
  	while(!q.empty()){
			size=q.size();
			for(int i=0;i<size;i++){
				if(i==0){
					prev=q.front();
					q.pop();
					cur=prev;
				}else{
					cur=q.front();
					prev->next=cur;
					prev=cur;
					q.pop();
				}
				if(cur->left) q.push(cur->left);
				if(cur->right) q.push(cur->right);
			}
			cur->next=nullptr;
		}
		return root;
  }
};

int main(){
  system("pause");
  return 0;
}
