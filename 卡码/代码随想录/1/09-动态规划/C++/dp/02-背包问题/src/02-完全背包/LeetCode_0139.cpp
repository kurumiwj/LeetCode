//139. 单词拆分
#include <iostream>
#include <vector>
#include <string>
#include <algorithm>
using namespace std;

class Solution {
public:
	bool wordBreak(string s, vector<string>& wordDict) {
		vector<bool> dp(s.size()+1,false);
		dp[0]=true;
		for(int i=1;i<=s.size();i++){
			for(int j=0;j<i;j++){
				if(find(wordDict.begin(),wordDict.end(),s.substr(j,i-j))!=wordDict.end()&&dp[j]) dp[i]=true;
			}
		}
		return dp[s.size()];
	}
};

int main(){
  system("pause");
  return 0;
}
