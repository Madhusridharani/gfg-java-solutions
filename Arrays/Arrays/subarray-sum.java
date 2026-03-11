/*
Problem: Subarray with Given Sum
Platform: GeeksforGeeks
Difficulty: Medium

Approach:
Use Sliding Window technique since the array contains
only non-negative integers.

Time Complexity: O(n)
Space Complexity: O(1)
*/

import java.util.*;

class Solution {
    static ArrayList<Integer> subarraySum(int[] arr, int target) {

        ArrayList<Integer> result = new ArrayList<>();

        int start = 0;
        int currentSum = 0;

        for(int end = 0; end < arr.length; end++){

            currentSum += arr[end];

            while(currentSum > target && start <= end){
                currentSum -= arr[start];
                start++;
            }

            if(currentSum == target){
                result.add(start + 1);
                result.add(end + 1);
                return result;
            }
        }

        result.add(-1);
        return result;
    }
}
