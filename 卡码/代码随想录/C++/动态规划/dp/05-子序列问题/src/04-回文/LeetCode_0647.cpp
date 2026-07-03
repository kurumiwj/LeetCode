//647. 回文子串
#include <iostream>
#include <vector>
using namespace std;

class Solution {
public:
	//动态规划
	int countSubstrings(string s) {
		vector<vector<bool>> dp(s.length(),vector<bool>(s.length(),false));
		int res=0;
		for(int i=s.length()-1;i>=0;i--){
			for(int j=i;j<s.length();j++){
				if(s[i]==s[j]&&(j-i<=1||dp[i+1][j-1])){
					dp[i][j]=true;
					res++;
				}
			}
		}
		return res;
	}
	//双指针
	int countSubstrings1(string s) {
		int res=0;
		for(int i=0;i<s.length();i++){
			res+=countPalindrome(s,i,i);
			res+=countPalindrome(s,i,i+1);
		}
		return res;
	}
	int countPalindrome(const string& s,int i,int j){
		int res=0;
		while(i>=0&&j<s.length()&&s[i]==s[j]){
			i--;
			j++;
			res++;
		}
		return res;
	}
};

int main(){
  system("pause");
  return 0;
}
