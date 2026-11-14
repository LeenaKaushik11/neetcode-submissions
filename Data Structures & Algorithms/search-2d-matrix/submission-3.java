class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }
        
        int left = 0, right = matrix.length - 1;
        int lenr = matrix[0].length;
        int corR = -1;
        
        // 1. Corrected binary search to find the right row
        while (left <= right) {
            int mid = left + (right - left) / 2;
            
            if (matrix[mid][0] <= target && matrix[mid][lenr - 1] >= target) {
                corR = mid;
                break;
            } else if (matrix[mid][0] > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        
        // If no valid row contains the target range, return false
        if (corR == -1) {
            return false;
        }
        
        // 2. Binary search within the identified row
        left = 0; 
        right = lenr - 1;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            
            if (matrix[corR][mid] == target) {
                return true;
            } else if (matrix[corR][mid] > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        
        return false;
    }
}