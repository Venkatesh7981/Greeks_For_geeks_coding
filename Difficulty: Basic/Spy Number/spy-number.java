class Solution {
    public boolean checkSpy(int n) {
        // code here
        int sum=0;
        int prod=1;
        int temp=n;
        while(n>0){
            int r=n%10;
            sum+=r;
            prod*=r;
            n=n/10;
        }
        return sum==prod;
    }
}
