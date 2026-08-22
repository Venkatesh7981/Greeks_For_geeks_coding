class Solution {
    public static int findMean(int[] arr) {
        // code here
         int avg=0;
         int sum=0;
         for(int num:arr){
             sum+=num;
         }
         return sum/arr.length;
    }
}