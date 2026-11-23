class Solution {
    public int findMin(int[] nums){
        int left =0;
        int right= nums.length-1;
        if(nums[left]<=nums[right]) return nums[left];
        while(left<right){
            int mid= (left+right)/2;
             if(nums[mid] <nums[right]) {
                right = mid;} else {
                left=mid+1;
            }
        }
        return nums[left];
    }
}


//  3 4 5 6 1 2

//  l=0 v3
//  r=5 v2

//  mid= 2 v5 minima is answer 1 -> 6l 2r

// 3< 5 -> left mid+1;
// right= mid;

// left= 3 v6
// r= 5 v2

// mid= 4 v1

// 4 -2 -1 0 1 2 3

// l= 0 v4
// r= 6 v3
// mid= 3 -> v0
// 4> 0 right=mid

// l=0 v4
// r=3 v0
// mid= 1 v=-2




