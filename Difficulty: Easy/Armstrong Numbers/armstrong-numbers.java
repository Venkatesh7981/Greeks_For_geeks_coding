// User function Template for Java
class Solution {
    static boolean armstrongNumber(int n) {
        // code here
    int temp=n;
    int sum=0;
    while(n!=0){
        int dig=n%10;
       
        sum+=Math.pow(dig,3);
        n/=10;
      }
      if(sum==temp){
          return true;
      }
      else{
      return false ;
      }
    }
}