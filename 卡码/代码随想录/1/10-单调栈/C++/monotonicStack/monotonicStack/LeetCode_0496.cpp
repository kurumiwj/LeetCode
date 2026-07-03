//496. 下一个更大元素 I
#include <iostream>
#include <stack>
#include <unordered_map>
#include <vector>
using namespace std;

class Solution {
public:
	vector<int> nextGreaterElement(vector<int>& nums1, vector<int>& nums2) {
		stack<int> st;
		unordered_map<int,int> m;
		vector<int> res(nums1.size(),-1);
		for(int i=0;i<nums1.size();i++) m[nums1[i]]=i;
		for(int i=0;i<nums2.size();i++){
			while(!st.empty()&&nums2[i]>nums2[st.top()]){
				if(m.find(nums2[st.top()])!=m.end()) res[m[nums2[st.top()]]]=nums2[i];
				st.pop();
			}
			st.push(i);
		}
		return res;
	}
};

int main(){
  system("pause");
  return 0;
}
