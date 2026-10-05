class Solution {
    public int subarraySum(int[] nums, int k) {
        int n = nums.length;
        int[] pref = new int[n+1];
        pref[0]=0;
        int result =0;
        for(int i=1; i<=n;i++){
            pref[i]=pref[i-1]+nums[i-1];
            if(pref[i]==k){
                result++;
            }
        }
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=1; i<=n;i++){
            int target = pref[i]-k;
            if(map.containsKey(target)){
                result += map.get(target);
            }
            map.put(pref[i], map.getOrDefault(pref[i],0)+1);

        }
        return result;
    }
}