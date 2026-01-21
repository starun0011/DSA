class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
    int p1= m+n-1, p2=m-1, p3=n-1;
    for(int i=p1; i>=0;i--){
        if(p2>=0 && p3>=0){
            nums1[p1--]= (nums1[p2]>nums2[p3])?nums1[p2--]:nums2[p3--];
        }
        else if(p3 < 0){
            nums1[p1--] = nums1[p2--];
        }
        else if(p2 < 0){
            nums1[p1--] = nums2[p3--];
        }

    }
    
    }
}