class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] leftProduct = new int[nums.length+1];
        int[] rightProduct = new int[nums.length+1];
        int[] res = new int[nums.length];
        int[] result = new int[nums.length];
        leftProduct[0]=1;
        rightProduct[0]=1;
        for(int i =0;i< nums.length;i++){
            leftProduct[i+1]=leftProduct[i]*nums[i];
        }
        for(int i=0;i<nums.length;i++){
            res[i]=nums[nums.length-1-i];
        }
        for(int i=0;i<res.length;i++){
            rightProduct[i+1]=rightProduct[i]*res[i];
        }
        for(int i=0; i< nums.length;i++){
            result[i]=leftProduct[i]*rightProduct[nums.length-i-1];
        }
        return result;

    }
}  
