//763. 划分字母区间
#include <iostream>
#include <vector>
using namespace std;

class Solution {
public:
	vector<int> partitionLabels(string s) {
		int hash[30]={0};
		vector<int> res;
		int left=0,right=0;
		for(int i=0;i<s.length();i++){
			hash[s[i]-'a']=i;
		}
		for(int i=0;i<s.length();i++){
			right=max(right,hash[s[i]-'a']);
			if(i==right){
				res.push_back(right-left+1);
				left=i+1;
			}
		}
		return res;
	}
};

int main(){
  system("pause");
  return 0;
}
