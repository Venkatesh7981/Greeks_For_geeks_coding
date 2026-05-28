class Solution {
    int missingNum(int arr[]) {
        int n = arr.length + 1;

        int xor1 = 0; // XOR of 1 to n
        int xor2 = 0; // XOR of array elements

        // XOR all numbers from 1 to n
        for (int i = 1; i <= n; i++) {
            xor1 ^= i;
        }

        // XOR all elements of array
        for (int i = 0; i < arr.length; i++) {
            xor2 ^= arr[i];
        }

        // Missing number
        return xor1 ^ xor2;
    }
}