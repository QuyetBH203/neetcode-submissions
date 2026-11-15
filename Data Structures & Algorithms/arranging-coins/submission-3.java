class Solution {
    public int arrangeCoins(int n) {
        int left =1, right = n;
        int result =0;
        while(left <= right){
            int mid = left + (right - left)/2;
            if(calculate(mid) <= n){
                result = mid;
                left = mid+1;
            }else{
                right = mid-1;
            }

        }

        return result;

    }

    public long calculate(int mid){
       return (long) mid * (mid+1)/2;
    }
}