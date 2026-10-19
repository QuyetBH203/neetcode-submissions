class Solution {
    public int[] sortArray(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i=0;i <n;i++){
            pq.add(nums[i]);
        }
        int t=0;
        while(!pq.isEmpty() && t<n){
            result[t]=pq.poll();
            t++;
        }
        return result;

    }
}