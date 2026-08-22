class Solution {
    public int sumofproduct(int n) {
        // code here
        int sum=0;
        for(int i=1;i<=n;i++){
            int m=n/i;
            sum+=m*i;
        }
        return sum;
    }
}