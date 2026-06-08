class Solution {
    int majorityElement(int arr[]) {
        // code here
        HashMap <Integer,Integer> map=new HashMap<>();
        for(int num:arr){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        for(int num:arr){
        if(map.get(num)>arr.length/2){
            return num;
        }
        }
        return -1;
        
    }
}