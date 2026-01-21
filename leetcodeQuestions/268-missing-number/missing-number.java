class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int sumOfNNumbers = n * (n + 1) / 2;
        int actualLength  = 0;
        for(int i = 0; i < nums.length; i++){
           actualLength += nums[i]; 
        }
        return sumOfNNumbers - actualLength;
    }
}