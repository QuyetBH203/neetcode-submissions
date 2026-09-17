class Solution {
    public int subarraySum(int[] nums, int k) {
        int n = nums.length;
        int[] prefSum = new int[n+1];
        prefSum[0]=0;
        int result =0;
        for(int i=1;i<=n; i++){
            prefSum[i]=prefSum[i-1]+nums[i-1];
            if(prefSum[i]==k){
                result++;
            }
        }
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=1;i<=n;i++){
            int target = prefSum[i]-k;
            if (map.containsKey(target)) {
                result += map.get(target);
        }

        map.put(
            prefSum[i],
            map.getOrDefault(prefSum[i], 0) + 1
        );


        }
        return result;

    }
}