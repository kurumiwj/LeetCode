//42. 接雨水
#include <iostream>
#include <vector>
#include <stack>
using namespace std;

class Solution {
public:
	int trap(vector<int>& height) {
		stack<int> st;
		int res=0;
		for(int i=0;i<height.size();i++){
			while(!st.empty()&&height[i]>height[st.top()]){
				int mid=st.top();
				st.pop();
				if(!st.empty()){
					int h=min(height[i],height[st.top()])-height[mid];
					int w=i-st.top()-1;
					res+=h*w;
				}
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
