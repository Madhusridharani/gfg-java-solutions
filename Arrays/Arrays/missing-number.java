/*
Problem: Missing Number
Platform: GeeksforGeeks
Difficulty: Easy

Approach:
Use XOR operation to find the missing number.
All numbers cancel each other except the missing one.

Time Complexity: O(n)
Space Complexity: O(1)
*/

class Solution {
    int missingNumber(int arr[]) {
        
        int xor = 0;
        int n = arr.length + 1;

        for(int i = 1; i <= n; i++){
            xor ^= i;
        }

        for(int num : arr){
            xor ^= num;
        }

        return xor;
    }
}
