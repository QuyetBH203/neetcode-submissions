class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int left =1, right= Arrays.stream(piles).max().getAsInt();
        while(left < right){
            int mid = left +(right-left)/2;
            long totalHours = calculateHours(piles,mid);
            if(totalHours <= h){
                right = mid;
            }else{
                left = mid+1;
            }

        }
        return right;
        
    }

     private long calculateHours(int[] piles, int k) {
        long total = 0;

        for (int pile : piles) {
            total += (pile + (long) k - 1) / k;
        }

        return total;
    }
}
