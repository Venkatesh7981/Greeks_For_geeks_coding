class Solution {
    // Function to calculate factorial of a number.
    int factorial(int n) {
        // code here
        int fact=1;
        while(n>0){
            fact*=n;
            n--;
        }
        return fact;
    }
}
