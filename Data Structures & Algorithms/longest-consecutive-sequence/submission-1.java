class Solution {
    public int longestConsecutive(int[] nums) {
        int n = nums.length;
        Set<Integer> set = new HashSet<>();
        int result =0;
        for(int i=0; i < n;i++){
            set.add(nums[i]);
        }
        for(int i=0;i<n;i++){
            if(!set.contains(nums[i]-1)){
                int tmpLength =1;
                int res = nums[i];
                while(set.contains(res+1)){
                    tmpLength++;
                    res++;
                }
                result = Math.max(result, tmpLength);
            }
        }

        return result;
    }
}
