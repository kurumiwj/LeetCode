//392. 判断子序列
#include <iostream>
#include <vector>
using namespace std;

class Solution {
public:
	bool isSubsequence(string s, string t) {
		vector<vector<int>> dp(s.length()+1,vector<int>(t.length()+1,0));
		for(int i=1;i<s.length()+1;i++){
			for(int j=1;j<t.length()+1;j++){
				if(s[i-1]==t[j-1]) dp[i][j]=dp[i-1][j-1]+1;
				else dp[i][j]=dp[i][j-1];
			}
		}
		return dp[s.length()][t.length()]==s.length();
	}
};

int main(){
  system("pause");
  return 0;
}
