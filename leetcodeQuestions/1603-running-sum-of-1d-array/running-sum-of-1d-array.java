class Solution {
    public int[] runningSum(int[] nums) {
        int n = nums.length;
        int[] runningS = new int[n];
        int curSum=0;

        for(int i=0; i<n; i++){
            curSum += nums[i];
             runningS[i]=curSum;
        }
       return runningS;
    }
    
}