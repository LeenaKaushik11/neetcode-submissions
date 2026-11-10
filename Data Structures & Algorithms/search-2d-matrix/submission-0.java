class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        //find which row it lies..
        //find which index in that row it lies..

        //[1,8,10,13,14,40]
        //in which range does the answer liess...
        //it will e O[n] if i go on individually..

        // hence i need binary search

        int start = 0;
        if (matrix.length == 0) return false;
        int end = matrix.length-1;
        int lenRow = matrix[0].length; 
        int mid =-1;
        while(start<=end){
            mid = start+ (end-start)/2;
            if(matrix[mid][0] <= target && matrix[mid][lenRow-1]>=target){
                break;
            }
            else if(matrix[mid][lenRow-1]<target){
                start=mid+1;
            }
            else {
                end=mid-1;
            } 
        }
        if(mid <0 || mid>matrix.length-1 ) return false;
        
         start = 0;
         end = lenRow-1;
        int ind=mid;
         mid =-1;
        while(start<=end){
            mid = start+ (end-start)/2;
            if(matrix[ind][mid] == target){
                return true;
            }
            else if(matrix[ind][mid]<target){
                start=mid+1;
            }
            else {
                end=mid-1;
            } 
        }
        return false;
    }
}
