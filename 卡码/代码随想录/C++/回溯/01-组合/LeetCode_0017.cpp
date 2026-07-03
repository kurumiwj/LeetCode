//17. 电话号码的字母组合
#include <iostream>
#include <vector>
#include <string>
using namespace std;

class Solution {
	const string nums[10]={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
	vector<string> res;
public:
	void dfs(string digits,int index,const string& str){
		if(index==digits.length()){
			res.push_back(str);
			return;
		}
		int digit=digits[index]-'0';
		string letter=nums[digit];
		for(int i=0;i<letter.length();i++){
			dfs(digits,index+1,str+letter[i]);
		}
	}
	vector<string> letterCombinations(string digits) {
		if(digits.length()!=0) dfs(digits,0,"");
		return res;
	}
};

int main(){
  system("pause");
  return 0;
}
