class Solution {
    public int missingNumber(int[] arr) {
        //  code here
             int n=arr.length;
             HashSet<Integer> set=new HashSet<>();
             for(int num:arr){
                 if(num>0){
                     set.add(num);
                 }
             }
             int i=1;
             while(set.contains(i)){
                 i++;
             }
             return i;
    }
}
