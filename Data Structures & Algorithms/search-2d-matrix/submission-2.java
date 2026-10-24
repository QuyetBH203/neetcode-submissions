class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = matrix.length, col = matrix[0].length;
        int left =0, right = row * col -1;
        while(left <= right){
            int mid = left + (right -left)/2;
            int x = mid / col, y = mid % col;
            if(matrix[x][y] > target){
                right = mid - 1;
            }else if(matrix[x][y] < target){
                left = mid +1;
            }else {
                return true;
            }
        }

        return false;

    }

 
}
