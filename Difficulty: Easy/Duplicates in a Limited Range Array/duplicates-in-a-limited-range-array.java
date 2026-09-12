class Solution {
    public ArrayList<Integer> findDuplicates(int[] arr) {
        // code here
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int num:arr){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        ArrayList<Integer> a=new ArrayList<>();
        for(int num:map.keySet()){
            if(map.get(num)>1){
                a.add(num);
            }
        }
        return a;
    }
}