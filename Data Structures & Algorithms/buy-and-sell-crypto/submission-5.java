class Solution {
    public int maxProfit(int[] prices) {

     
        int result =0;
        int left =0, right =1;
        for(int i= right; i< prices.length;i++){
            while(prices[i]< prices[left]){
                left++;
            }
            result = Math.max(result, prices[i]-prices[left]);

        }
        return result;
    }
}
