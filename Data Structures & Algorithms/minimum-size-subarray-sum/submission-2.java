class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        // Solution 1: brute force 
        // int result = Integer.MAX_VALUE;
        // int n = nums.length;
        // for(int i=0;i<n;i++){
        //     int res =0;
        //     res +=nums[i];
        //     if(res >= target){
        //         result = Math.min(result,1);
        //         break;
        //     }
        //     for(int j=i+1;j<n;j++){
        //         res +=nums[j];
        //         if(res >= target){
        //             result = Math.min(result, j-i+1);
        //              break;
        //         }
               
        //     }
        // }
        // if(result == Integer.MAX_VALUE){
        //     return 0;
        // }else{
        //     return result;
        // }

        // Solution 2: Sliding Window
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