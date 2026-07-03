//860. ÄûÃÊË®ÕÒÁã
#include <iostream>
#include <vector>
using namespace std;

class Solution {
public:
  bool lemonadeChange(vector<int>& bills) {
		int five=0,ten=0;
		for(int bill:bills){
			switch(bill){
				case 5:
					five++;
					break;
				case 10:
					if(five>0){
						five--;
						ten++;
					}else return false;
					break;
				case 20:
					if(ten>0&&five>0){
						ten--;
						five--;
					}else if(five>2){
						five-=3;
					}else return false;
			}
		}
		return true;
  }
};

int main(){
  system("pause");
  return 0;
}
