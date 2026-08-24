class Solution {
    public static int[] lcmAndGcd(int a, int b) {
        // code here
        int ans[]=new int[2];
        int hcf=0;
        int lcm=0;
        for(int i=1;i<=a;i++){
            if(a%i==0 && b%i==0){
                hcf=i;
                lcm=(a*b)/hcf;
                ans[0]=lcm;
                ans[1]=hcf;
            }
        }
        return ans;
    }
}