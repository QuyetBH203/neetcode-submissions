class Solution {
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        k %= n;
        reverseArray(nums,0,n-1);
        reverseArray(nums,0,k-1);
        reverseArray(nums,k,n-1);

    }

    public void reverseArray(int[] nums, int left, int right){
        while(left < right){
            int tmp = nums[left];
            nums[left]=nums[right];
            nums[right]=tmp;
            left++;
            right--;
        }
    }
}