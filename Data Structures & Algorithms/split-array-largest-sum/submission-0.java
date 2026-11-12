class Solution {
    public int splitArray(int[] nums, int k) {
        int left = Arrays.stream(nums).max().getAsInt();
        int right =  Arrays.stream(nums).sum();
        int ans =right;
        while(left <= right){
            int mid = left + (right - left) /2;
            if(canSplit(nums, k, mid)){
                ans = mid;
                right = mid -1;
            }else {
                left = mid +1;
            }
        }

        return ans;
    }

    private boolean canSplit(int[] nums, int k , int maxNums){
        int maxArrays = 1, sumNums = 0;
        for(int x: nums){
            if(sumNums +x <= maxNums){
                sumNums +=x;

            }else {
                maxArrays++;
                sumNums =x;
                if(maxArrays > k){
                    return false;
                }
            }
        }

        return true;
    }
}