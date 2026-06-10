class Solution {
    public ArrayList<Integer> prefSum(int[] arr) {
        // code here/
        int sum=0;
        ArrayList<Integer> ans=new ArrayList<>(arr.length-1);
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            ans.add(sum);
        }
        return ans;
    }
}