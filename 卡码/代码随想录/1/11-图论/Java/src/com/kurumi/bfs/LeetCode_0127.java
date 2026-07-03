//127. 单词接龙
package com.kurumi.bfs;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class LeetCode_0127 {

}
class Solution {
	HashSet<String> wordSet;
	HashSet<String> visited=new HashSet();
	Deque<String> q=new ArrayDeque<>();
	public boolean changeLetter(String word,String target) {
		char[] chars = word.toCharArray();
		for(int i=0;i<chars.length;i++) {
			char origin=chars[i];
			for(char ch='a';ch<='z';ch++) {
				chars[i]=ch;
				String newWord = String.valueOf(chars);
				if(target.equals(newWord)) return true;
				if(wordSet.contains(newWord)&&!visited.contains(newWord)) {	//单词集合包含新单词且未被访问过
					visited.add(newWord);
					q.offer(newWord);
				}
			}
			chars[i]=origin;	//回溯
		}
		return false;
	}
  public int ladderLength(String beginWord, String endWord, List<String> wordList) {
  	wordSet=new HashSet<>(wordList);
  	if(!wordSet.contains(endWord)) return 0;	//未找到终点字符串
  	visited.add(beginWord);
  	q.offer(beginWord);
  	int path=1;
  	while(!q.isEmpty()) {
  		int size=q.size();
  		for(int i=0;i<size;i++) {
  			String word = q.poll();
  			if(changeLetter(word,endWord)) return path+1;
  		}
  		path++;
  	}
  	return 0;
  }
}