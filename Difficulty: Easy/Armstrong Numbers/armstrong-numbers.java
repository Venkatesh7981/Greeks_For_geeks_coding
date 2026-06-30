class Solution {
    static boolean armstrongNumber(int n) {
        // code here
        int org=n;
        int sum=0;
        int count=0;
        while(n!=0){
            int dig=n%10;
            n/=10;
            count++;
        }
        
        n=org;
        while(n!=0){
            int r=n%10;
            n=n/10;
            int ans=1;
            for(int i=1;i<=count;i++){
                ans=ans*r;
            }
            sum=sum+ans;
        }
       if(sum==org){
          return true;
      }
      else{
      return false ;
      }
    }
}