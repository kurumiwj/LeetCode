//127. 单词接龙
#include <iostream>
#include <vector>
#include <unordered_set>
#include <unordered_map>
#include <queue>
#include <string>
using namespace std;

class Solution {
public:
	int ladderLength(string beginWord, string endWord, vector<string>& wordList) {
		unordered_set<string> wordSet(wordList.begin(),wordList.end());
		if(wordSet.find(endWord)==wordSet.end()) return 0;	//没有找到终点单词
		unordered_map<string,int> visited;
		queue<string> q;
		q.push(beginWord);
		visited.insert(make_pair(beginWord,1));	//记录开始单词路径
		while(!q.empty()){
			string word=q.front();
			q.pop();
			int path=visited[word];
			for(int i=0;i<word.size();i++){
				string newWord=word;
				for(int j=0;j<26;j++){
					newWord[i]=j+'a';
					if(newWord==endWord) return path+1;
					if(wordSet.find(newWord)!=wordSet.end()&&visited.find(newWord)==visited.end()){
						visited.insert(make_pair(newWord,path+1));
						q.push(newWord);
					}
				}
			}
		}
		return 0;
	}
};

int main(){
  system("pause");
  return 0;
}
