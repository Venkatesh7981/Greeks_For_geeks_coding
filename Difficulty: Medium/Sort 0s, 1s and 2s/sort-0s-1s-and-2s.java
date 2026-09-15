class Solution {
    public void sort012(int[] arr) {
        // code here
        int count1=0;
        int count2=0;
        int count3=0;
        for(int num:arr){
            if(num==0) count1++;
            else if(num==1) count2++;
            else count3++;
        }
        int ind=0;
        for(int i=0;i<count1;i++){
            arr[ind++]=0;
        }
        for(int i=0;i<count2;i++){
            arr[ind++]=1;
        }
        for(int i=0;i<count3;i++){
            arr[ind++]=2;
        }
    }
}