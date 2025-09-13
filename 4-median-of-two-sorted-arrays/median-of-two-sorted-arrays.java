class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1 = nums1.length, n2= nums2.length, n3 = n1+n2;
        int p1=0, p2=0, p3=0;
        int[] mergedArray = new int[n3];
        // sorting and assigning into mergedArray
        for(int i=0; i<n3; i++){
            if(p1<n1 && p2<n2){
                mergedArray[i] = (nums1[p1]<nums2[p2])?nums1[p1++]:nums2[p2++]; 
            }
            else if(p1>=n1){
                mergedArray[i] = nums2[p2++];
            }
            else{
                mergedArray[i] = nums1[p1++];
            }
        }

        if(n3%2!=0){
            double med = mergedArray[n3/2];
            return med;
        }
        
        else{
            double e1 = mergedArray[n3/2];
            double e2 = mergedArray[n3/2-1];
            return (e1+e2)/2;

        }


    }
}