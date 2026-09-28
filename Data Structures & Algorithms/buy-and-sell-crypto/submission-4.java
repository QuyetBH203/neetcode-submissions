class Solution {
    public int maxProfit(int[] prices) {

        // Solution 1: Brute force
        // int result =0;
        // for(int i=0;i<prices.length;i++){
        //     for(int j=i+1;j<prices.length;j++){
        //         result = Math.max(result,prices[j]-prices[i]);
        //     }
        // }
        // return result;

        // Solution 2: More Optimize 
        int result =0;
        int left =0, right =1;
        for(int i= right; i< prices.length;i++){
            while(prices[i]< prices[left]){
                left++;
            }
            // i=left+1;
            result = Math.max(result, prices[i]-prices[left]);

            // if(prices[i]< prices[left]){
            //     left++;
            //     continue;
            // }else {
            //     result = Math.max(result, prices[i]-prices[left]);
            // }
        }
        return result;
    }
}
