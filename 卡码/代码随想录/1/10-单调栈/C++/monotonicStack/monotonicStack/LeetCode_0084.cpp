//84. 柱状图中最大的矩形
#include <iostream>
#include <vector>
#include <stack>
using namespace std;

class Solution {
public:
	int largestRectangleArea(vector<int>& heights) {
		heights.insert(heights.begin(),0);
		heights.push_back(0);
		stack<int> st;
		int res=0;
		for(int i=0;i<heights.size();i++){
			while(!st.empty()){
				if(heights[i]==heights[st.top()]) st.pop();
				else if(heights[i]<heights[st.top()]){
					int mid=st.top();
					st.pop();
					if(!st.empty()){
						int h=heights[mid];
						int w=i-st.top()-1;
						res=max(res,h*w);
					}
					continue;
				}
				break;
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
