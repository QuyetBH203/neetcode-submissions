class Solution {
    public int splitArray(int[] nums, int k) {
        int left = Arrays.stream(nums).max().getAsInt();
        int right = Arrays.stream(nums).sum();
        int ans = -1;
        while(left <= right){
            int mid = left + (right - left)/2;
            if(canSplit(nums,mid, k)){
                ans = mid;
                right = mid-1;
            }else{
                left = mid+1;
            }
        }

        return ans;

    }

    private boolean canSplit(int[] nums, int mid, int k){
        int numArrays = 1;
        int sumArrays =0;
        for(int x: nums){
            if(sumArrays + x <= mid){
                sumArrays += x;
            }else{
                numArrays +=1;
                sumArrays =x;
                if(numArrays > k){
                    return false;
                }
            }
        }

        return true;
    }


}