class Solution {
    public boolean hasDuplicate(int[] nums) {
        Map<Integer,Integer> tmp = new HashMap<>();
        for(int i =0; i<nums.length;i++){
            if(tmp.containsKey(nums[i])){
                tmp.put(nums[i],tmp.get(nums[i])+1);
            }else{
                tmp.put(nums[i],1);
            }
        }
        for(Integer value: tmp.values()){
            if(value >1){
                return true;
            }
        }
        return false;
    }
}