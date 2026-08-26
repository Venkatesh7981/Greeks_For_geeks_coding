class Solution {
    void pushZerosToEnd(int[] arr) {
        // code here
        int i=0;
        for(int num:arr){
            if(num!=0){
                arr[i]=num;
                i++;
            }
        }
        
        for(int j=i;j<=arr.length-1;j++){
            arr[i]=0;
            i++;
        }
    }
}