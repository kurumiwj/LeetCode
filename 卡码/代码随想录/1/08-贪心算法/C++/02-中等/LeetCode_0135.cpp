//135. ·Ö·¢ÌÇ¹û
#include <iostream>
#include <vector>
#include <numeric>
using namespace std;

class Solution {
public:
  int candy(vector<int>& ratings) {
		vector<int> can(ratings.size(),1);
		for(int i=1;i<ratings.size();i++)
			if(ratings[i]>ratings[i-1]) can[i]=can[i-1]+1;
		for(int i=ratings.size()-2;i>=0;i--)
			if(ratings[i]>ratings[i+1]) can[i]=max(can[i+1]+1,can[i]);
		return accumulate(can.begin(),can.end(),0);
  }
};

int main(){
  system("pause");
  return 0;
}
