//134. ╪ссму╬
#include <iostream>
#include <vector>
using namespace std;

class Solution {
public:
  int canCompleteCircuit(vector<int>& gas, vector<int>& cost) {
		int start=0,total=0,current=0;
		for(int i=0;i<gas.size();i++){
			current+=(gas[i]-cost[i]);
			total+=(gas[i]-cost[i]);
			if(current<0){
				current=0;
				start=i+1;
			}
		}
		if(total<0) return -1;
		return start;
  }
};

int main(){
  system("pause");
  return 0;
}
