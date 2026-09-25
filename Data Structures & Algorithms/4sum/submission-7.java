class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        int n = nums.length;
        List<List<Integer>> arr = new ArrayList<>();
        for(int i=0;i<n-3;i++){
            if(i>0 && nums[i] == nums[i-1]){
                continue;
            }
            for(int j= i+1; j< n-2;j++){
                if(j>i+1 && nums[j] == nums[j-1]){
                    continue;
                }
                long need = (long) target - nums[i] - nums[j];
                int t = j+1, k =n-1;
                while(t<k){
                    long sum = (long) nums[t] + nums[k];
                    if(sum == need){
                        arr.add(List.of(nums[i], nums[j], nums[t], nums[k]));
                        while(t < k && nums[t] == nums[t+1]){
                            t++;
                        }
                        while( t< k && nums[k]==nums[k-1]){
                            k--;
                        }
                        t++;
                        k--;
                    }else if(sum < need){
                        t++;
                    }else {
                        k--;
                    }
                }
            }
        }

        return arr;
        
    }
}