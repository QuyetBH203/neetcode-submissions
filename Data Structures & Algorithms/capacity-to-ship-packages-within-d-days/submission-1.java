class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int left =Arrays.stream(weights).max().getAsInt();
        int right =  Arrays.stream(weights).sum();
        int n= weights.length;
        while(left < right){
            int mid = left + (right-left)/2;
            if(canShip(weights, mid, days)){
                right = mid;
            }else {
                left = mid+1;
            }

        }
        return right;

    }
    
    private boolean canShip(int[] weights, int capacity, int days){
        int totalDays =1;
        int currentWeights=0;
        for(int weight: weights){
            if(currentWeights + weight > capacity){
                totalDays +=1;
                currentWeights = weight;
            }else {
                currentWeights += weight;
            }
        }
        return totalDays <= days;
    }
}