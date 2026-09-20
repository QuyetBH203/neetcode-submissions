class NumMatrix {

    private int[][] matrix;

    public NumMatrix(int[][] matrix) {
        this.matrix = matrix;
    }
    
    public int sumRegion(int row1, int col1, int row2, int col2) {
        int n = matrix.length;
        int m = matrix[0].length;
        int[][] pref = new int[n+1][m+1];
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                pref[i][j]=pref[i][j-1]+pref[i-1][j]-pref[i-1][j-1]+matrix[i-1][j-1];
            }
        }
        int result = pref[row2+1][col2+1]-pref[row2+1][col1]-pref[row1][col2+1]+pref[row1][col1];
        return result;
    }
}

/**
 * Your NumMatrix object will be instantiated and called as such:
 * NumMatrix obj = new NumMatrix(matrix);
 * int param_1 = obj.sumRegion(row1,col1,row2,col2);
 */