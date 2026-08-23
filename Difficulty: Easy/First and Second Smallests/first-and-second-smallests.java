class Solution {
    public ArrayList<Integer> minAnd2ndMin(int[] arr) {
        // code here
     int smallest = Integer.MAX_VALUE;
      int secondsmallest = Integer.MAX_VALUE;

      smallest = arr[0]; 
     for(int i = 1; i< arr.length; i++){
         if(arr[i]<smallest){
             secondsmallest=smallest;
             smallest=arr[i];
         }
         else if(arr[i] > smallest && arr[i] < secondsmallest) {
             secondsmallest = arr[i];
         }
     }
      ArrayList<Integer> result = new ArrayList<>();

     if(secondsmallest == Integer.MAX_VALUE) {
         result.add(-1);
     } else {
         result.add(smallest);
         result.add(secondsmallest);
     }

     return result;   
    }
}
