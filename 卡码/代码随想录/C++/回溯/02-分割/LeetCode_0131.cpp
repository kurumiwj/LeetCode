//131. 分割回文串
#include <iostream>
#include <vector>
#include <string>
using namespace std;

class Solution {
	vector<string> path;
	vector<vector<string>> res;
public:
	bool isPalindrome(string s,int start,int end){
		while(start<end){
			if(s[start]!=s[end]) return false;
			start++;
			end--;
		}
		return true;
	}
	void backtracking(string s,int index){
		if(index>=s.length()){
			res.push_back(vector<string>(path));
			return;
		}
		for(int i=index;i<s.length();i++){
			if(isPalindrome(s,index,i)) path.push_back(s.substr(index,i-index+1));
			else continue;
			backtracking(s,i+1);
			path.pop_back();
		}
	}
	vector<vector<string>> partition(string s) {
		backtracking(s,0);
		return res;
	}
};

int main(){
  system("pause");
  return 0;
}
