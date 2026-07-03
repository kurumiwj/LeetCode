//429. N ²æÊ÷µÄ²ãĞò±éÀú
#include <iostream>
#include <vector>
#include <queue>
using namespace std;

class Node {
public:
  int val;
  vector<Node*> children;
  Node() {}
  Node(int _val) {
    val = _val;
  }
  Node(int _val, vector<Node*> _children) {
    val = _val;
    children = _children;
  }
};

class Solution {
public:
  vector<vector<int>> levelOrder(Node* root) {
    vector<vector<int>> res;
    vector<int> v;
    queue<Node*> q;
    int size;
    if(root) q.push(root);
    while(!q.empty()){
			size=q.size();
			v.clear();
			while(size-->0){
				Node* node=q.front();
				q.pop();
				v.push_back(node->val);
				for(Node* tmp:node->children){
					q.push(tmp);
				}
			}
			res.push_back(v);
		}
		return res;
  }
};

int main(){
  system("pause");
  return 0;
}
