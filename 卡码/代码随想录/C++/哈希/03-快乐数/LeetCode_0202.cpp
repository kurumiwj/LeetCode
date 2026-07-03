//202. ¿ìÀÖÊı
#include <iostream>
#include <unordered_set>
using namespace std;

class Solution {
public:
  bool isHappy(int n) {
		unordered_set<int> s;
		while(n!=1&&s.find(n)==s.end()){
			s.insert(n);
			n=getSum(n);
		}
		return n==1;
  }
  int getSum(int n){
  	int sum=0;
		while(n>0){
			sum+=(n%10)*(n%10);
			n/=10;
		}
		return sum;
	}
};
