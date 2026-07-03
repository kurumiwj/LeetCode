//383. Êê½ğĞÅ
#include <iostream>
#include <string>
using namespace std;

class Solution {
public:
  bool canConstruct(string ransomNote, string magazine) {
		if(ransomNote.length()>magazine.length()) return false;
		int hash[26]={0};
		for(char ch:magazine)
			hash[ch-'a']++;
		for(char ch:ransomNote){
			hash[ch-'a']--;
			if(hash[ch-'a']<0) return false;
		}
		return true;
  }
};
