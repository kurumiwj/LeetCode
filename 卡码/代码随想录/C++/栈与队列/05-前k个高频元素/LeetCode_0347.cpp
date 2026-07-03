//347. 前K个高频元素
#include <iostream>
#include <vector>
#include <unordered_map>
#include <priority_queue>
using namespace std;

class Comp{
public:
	bool operator()(const pair<int,int>& a,const pair<int,int>& b){
		return a.second>b.second;
	}
};

class Solution {
public:
	vector<int> topKFrequent(vector<int>& nums, int k) {
		//统计元素出现频率
		unordered_map<int,int> m;
		for(int num:nums) m[num]++;
		priority_queue<pair<int,int>,vector<pair<int,int>>,Comp> q;
		for(auto it=m.begin();it!=m.end();it++){
			q.push(*it);
			//如果小顶堆元素大于k个则弹出
			if(q.size()>k) q.pop();
		}
		vector<int> res(k);
		for(int i=k-1;i>=0;i--){
			res[i]=q.top().first;
			q.pop();
		}
		return res;
	}
};

int main(){
	system("pause");
	return 0;
}
