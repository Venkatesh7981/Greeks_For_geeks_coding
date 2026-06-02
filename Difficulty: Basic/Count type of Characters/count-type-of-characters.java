// User function Template for Java

class Sol {
    int[] count(String s) {
        // your code here
        int []ans=new int[4];
        for(char ch:s.toCharArray()){
            if(Character.isUpperCase(ch)){
                ans[0]++;
            }
         else if(Character.isLowerCase(ch)){
                ans[1]++;
            }
         else if(Character.isDigit(ch)){
                ans[2]++;
            }
            else {
                ans[3]++;
            }
            
        }
return ans;
        
    }
}