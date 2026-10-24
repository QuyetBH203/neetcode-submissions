class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m =matrix.length;
        for(int i=0;i <m;i++){
            if(findTarget(matrix[i],target) >= 0){
                return true;
            }
        }

        return false;
    }

    public int findTarget(int[] nums, int target){
        int left =0, right = nums.length -1;
        while(left <= right){
            int mid = left + (right - left)/2;
            if(nums[mid]==target){
                return mid;
            }else if(nums[mid]>target){
                right = mid -1;
            }else {
                left = mid+1;
            }
        }
        return -1;
    }
}
