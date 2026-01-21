class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] res= new int[n];
        int[] prefix= new int[n];
        prefix[0]=nums[0];
        int p = 1;
        int[] suffix= new int[n];
        suffix[n-1]=nums[n-1];
        int s=n-2;
        while(p<n && s>=0){
          prefix[p] = nums[p]*prefix[p-1];
          p++;
          suffix[s]= nums[s]*suffix[s+1];
          s--; 
        }
        res[0]=suffix[1];
        res[n-1]=prefix[n-2];
        for(int i=1; i<=n-2;i++){
            res[i]=prefix[i-1]*suffix[i+1];
        }
        return res;
        
        }
    
}
