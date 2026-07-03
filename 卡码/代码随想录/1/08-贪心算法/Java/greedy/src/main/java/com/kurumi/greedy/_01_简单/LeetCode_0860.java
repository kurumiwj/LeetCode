//860. 柠檬水找零
package com.kurumi.greedy._01_简单;

public class LeetCode_0860 {

}
class Solution {
  public boolean lemonadeChange(int[] bills) {
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
            five--;
            ten--;
          }else if(five>=3){
            five-=3;
          }else return false;
      }
    }
    return true;
  }
}
