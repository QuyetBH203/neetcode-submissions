class Solution {
    public int[] getConcatenation(int[] nums) {
        int m = nums.length*2;
        int n = nums.length;
        int[] ans = new int[m];
        for(int i =0; i<m; i++){
            if(i<nums.length){
                ans[i]=nums[i];
            }else{
                ans[i]=nums[i-n];
            }
        }
        return ans;
    }
}