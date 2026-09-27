class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        
        int n= nums.length;
        int result = Integer.MAX_VALUE;
        int left=0, right=0;
        int res =0;
        for(int i=right; i<n;i++){
            res +=nums[i];
            while(res >= target){
                result = Math.min(result, right-left+1);
                res -= nums[left];
                left++;
            }
            right++;
        }
        if(result == Integer.MAX_VALUE){
            return 0;
        }else{
            return result;
        }

    }
}