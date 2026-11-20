class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int R = matrix.length;
        int C = matrix[0].length;
        int left = 0;
        int right = encode(R - 1, C - 1, C);
        while (left <= right) {
            int mid = right + (left - right) / 2;
            int[] v = decode(mid, C);
            int value = matrix[v[0]][v[1]];
            if (value == target) {
                return true;
            } else if (value > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return false;
    }

    int encode(int r, int c, int n) {
        return r * n + c;
    }

    int[] decode(int D, int n) {
        return new int[]{D / n, D % n};
    }
}
