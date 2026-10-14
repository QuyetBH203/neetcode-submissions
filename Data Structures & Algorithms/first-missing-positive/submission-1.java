class Solution {
    public int firstMissingPositive(int[] nums) {
        int n= nums.length;
        int i=0;
        while(i <n){
            int correctIndex = nums[i]-1;
            if(nums[i] >= 1 && nums[i] <=n && nums[i] != nums[correctIndex] ){
                int tmp = nums[i];
                nums[i]=nums[correctIndex];
                nums[correctIndex]=tmp;
            }else{
                i++;
            }
        }
        for(int j=0;j<n;j++){
            if(nums[j] != j+1){
                return j+1;
            }
        }

        return n+1;
    }
}