class NumMatrix {
int[][] ps;
    public NumMatrix(int[][] matrix) {
        int rows= matrix.length, col= matrix[0].length;
         ps= new int[rows+1][col+1];
        for(int i=0;i<rows;i++){
            for(int j=0;j<col;j++){
                ps[i+1][j+1]= matrix[i][j]+ps[i][j+1]+ps[i+1][j]- ps[i][j];
                // System.out.println(ps[i+1][j+1]);
            }
            // System.out.println("cut");
        }
    
    }
    
    public int sumRegion(int row1, int col1, int row2, int col2) {
        row1++; col1++; row2++; col2++;
        int bottomRight = ps[row2][col2];
        int above = ps[row1 - 1][col2];
        int left = ps[row2][col1 - 1];
        int topLeft = ps[row1 - 1][col1 - 1];
        return bottomRight - above - left + topLeft;
    }
}

/**
 * Your NumMatrix object will be instantiated and called as such:
 * NumMatrix obj = new NumMatrix(matrix);
 * int param_1 = obj.sumRegion(row1,col1,row2,col2);
 */