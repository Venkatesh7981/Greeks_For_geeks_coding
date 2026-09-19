class Solution {
    ArrayList<Integer> remDuplicate(int arr[]) {
        // code here
        HashSet<Integer> set=new HashSet<>();
        for(int num:arr){
            set.add(num);
        }
        ArrayList<Integer> a=new ArrayList<>();
        for(int num:set){
            a.add(num);
        }
        return a;
    }
}