class Solution {
    public String longest(String[] arr) {
        // code here
        int max=0;
            String name="";
            for(String s : arr)
            {
                int length=s.length();
                if(max<length)
                {
                    max=length;
                    name=s;
                }
            }
            return name;
    }
}