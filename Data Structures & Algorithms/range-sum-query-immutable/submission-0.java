class NumArray {

    private int[] nums;

    public NumArray(int[] nums) {
        this.nums = nums;
    }
    
    public int sumRange(int left, int right) {
        int n = nums.length;
        int[] prefSum = new int[n+1];
        prefSum[0]=0;
        for(int i=1; i<=n;i++){
            prefSum[i]=prefSum[i-1]+nums[i-1];
        }
        return prefSum[right+1]-prefSum[left];
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */