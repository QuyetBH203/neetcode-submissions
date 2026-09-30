class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        // Solution 1: brute force, iterating sliding window with size k
        // size k => n-k+1 window
        // int n = nums.length;
        // int[] result = new int[n-k+1];
        // for(int i=0;i<= n-k;i++){
        //     int res = Integer.MIN_VALUE;
        //     for(int left =i; left < i+k;left++){
        //         res = Math.max(res, nums[left]);
        //     }
        //     result[i]=res;
            
        // }
        // return result;
        int n= nums.length;
        Deque<Integer> deque = new ArrayDeque<>();
        int[] result = new int[n-k+1];
        for(int right=0; right <n;right++){
            while(!deque.isEmpty() && deque.peekFirst() <= right-k){
                deque.removeFirst();
            }
            while(!deque.isEmpty() && nums[right] >= nums[deque.peekLast()] ){
                deque.removeLast();
            }
            deque.addLast(right);
            if(right >= k-1){
                result[right-k+1]=nums[deque.peekFirst()];
            }
            
        }
        return result;
    }
}
