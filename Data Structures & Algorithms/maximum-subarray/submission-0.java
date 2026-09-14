class Solution {
    public int maxSubArray(int[] nums) {
        int n = nums.length;
        int ans = Integer.MIN_VALUE;
        int[] prefSum = new int[n+1];
        int[] prefMin = new int[n+1];
        prefSum[0]=0;
        prefMin[0]=0;
        for(int i=1;i<=n;i++){
            prefSum[i]=prefSum[i-1] + nums[i-1];
            prefMin[i] = Math.min(prefMin[i-1], prefSum[i]);
        }
        for(int i=1;i<=n;i++){
            ans = Math.max(ans, prefSum[i]-prefMin[i-1]);
        }
        return ans;
    }
}
