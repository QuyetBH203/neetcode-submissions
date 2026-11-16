class Solution {
    public int maximumCandies(int[] candies, long k) {
        int left = 1;
        int right = Arrays.stream(candies).max().getAsInt();
        int result =0;
        while(left <= right){
            int mid = left + (right -left)/2;
            long tmp =0;
            for(int candy: candies){
               tmp += (long) candy / mid;
            }
            if(tmp >= k){
                result = mid;
                left = mid +1;
            }else {
                right = mid -1;
            }
        }

        return result;

    }
}
