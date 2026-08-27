class Solution {
    boolean isPalindrome(String s) {
        // code here
        char a[]=s.toCharArray();
        int i=0;
        int j=a.length-1;
        while(i<j){
            if(a[i]!=a[j]){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}