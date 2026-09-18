class Solution {
    public int[] singleNum(int[] nums) {
        // Code here
        int n=nums.length;
        int ans[]=new int[2];
         HashMap<Integer,Integer> map=new HashMap<>();
               for(int num:nums){
                map.put(num,map.getOrDefault(num,0)+1);
    }
             int i=0;
               for(int num:map.keySet()){
                 if(map.get(num)==1){
                    ans[i++]=num;
                 }
               }
               Arrays.sort(ans);
               return ans;
    }
}