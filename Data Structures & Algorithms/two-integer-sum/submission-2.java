class Solution {
    public int[] twoSum(int[] nums, int target) {
      Map<Integer,Integer> map = new LinkedHashMap<>();
      for(int i=0;i < nums.length;i++){
        int res = target - nums[i];
        // map.put(nums[i],i);
        if(map.containsKey(res)){
            return new int[]{map.get(res),i};
        }
        map.put(nums[i],i);
      }

      return new int[]{};
    }
}
