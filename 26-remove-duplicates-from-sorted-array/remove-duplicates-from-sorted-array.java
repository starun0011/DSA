class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length == 0) return 0;

        int i = 0; //pointer for unique elements
        for(int j=1; j<nums.length; j++){
            //no need to check if they are equal and increase j because its already increasing in for loop;
            if(nums[i] != nums[j]){
                i++;
                nums[i]=nums[j];
            }
        }        
        return i+1;
    }
}