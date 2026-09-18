class Solution {
    public int findUnique(int[] nums) {
        // code here
        HashMap<Integer,Integer> map=new HashMap<>();
               for(int num:nums){
                map.put(num,map.getOrDefault(num,0)+1);
               }
               for(int num:map.keySet()){
                 if(map.get(num)==1){
                    return num;
                 }
               }
               return -1;
    }
}