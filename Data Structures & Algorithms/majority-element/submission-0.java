class Solution {
    public int majorityElement(int[] nums) {
        // List<Integer> result = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();
        int n = nums.length;
        for(int i=0;i<n;i++){
            map.put(nums[i], map.getOrDefault(nums[i],0)+1);
        }
        for(Integer x: map.keySet()){
            if(map.get(x) > n/2){
                return x;
            }
        }
        return -1;
    }
}