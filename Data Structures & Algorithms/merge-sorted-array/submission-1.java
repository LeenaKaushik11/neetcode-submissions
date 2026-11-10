class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
     int l=m-1;
     int r=n-1;
     int end= m+n-1;
     while(l>-1 && r>-1){
        if(nums1[l]>nums2[r]) nums1[end--]=nums1[l--];
        else nums1[end--]=nums2[r--];
     }

        while(r>-1){
        nums1[end--]=nums2[r--];
     }   
    }
}