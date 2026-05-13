class Solution {
    public boolean containsDuplicate(int[] nums) {
        if(nums.length == 1) return false;
        HashSet seen = new HashSet<Integer>();
        for(int i=0; i<nums.length;i++){
            if(seen.contains(nums[i])){
                return true;
            }
            else{
                seen.add(nums[i]);
            }
        }
        return false;
    }
}