class Solution {
    public int search(int[] nums, int target) {
     int left=0;
     int right=nums.length-1;
     while(left<right){
        int mid= (left+right)/2;
        if(nums[mid]<nums[right]) { right= mid;}
        else {
            left=mid+1;
        }
     }
     if(nums[left]<=target && nums[nums.length-1]>=target){
        right= nums.length-1;
     } else {
        right=left-1;
        left = 0;

     }
     if(left == right && nums[left]== target) return left;
     while(left<=right){
        int mid= (left+right)/2;
        if(nums[mid]== target) return mid;
        if(nums[mid]>target) {right=mid-1;}
        else {
            left=mid+1;
        }
     }
     return -1;

    }
}
