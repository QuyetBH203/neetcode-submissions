class Solution {
    public int pivotIndex(int[] nums) {
        int n = nums.length;
        int[] prefSum = new int[n+1];
        prefSum[0]=0;
        for(int i=1;i<=n ;i++){
            prefSum[i]=prefSum[i-1]+nums[i-1];
        }
        for(int i=0;i<n;i++){
           int left = prefSum[i];
           int right = prefSum[n]-prefSum[i+1];
           if(left == right){
            return i;
           }
        }
        return -1;
        
    }
}