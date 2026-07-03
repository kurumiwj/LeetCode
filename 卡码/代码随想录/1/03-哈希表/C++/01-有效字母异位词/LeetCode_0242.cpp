//242. 有效的字母异位词
#include <iostream>
#include <string>
using namespace std;

class Solution {
public:
	bool isAnagram(string s, string t) {
		int hash[26]={0};
		for(int i=0;i<s.length();i++) hash[s[i]-'a']++;
		for(int i=0;i<t.length();i++) hash[t[i]-'a']--;
		for(int i:hash)
			if(i!=0) return false;
		return true;
  }
};
