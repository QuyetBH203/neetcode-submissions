class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        int[] result = new int[n-k+1];
        Deque<Integer> deque = new ArrayDeque<>();
        for(int right=0; right<n; right++){
            // duyet cac window tu k-1 den n-1
            // iterating right k-1 to n-1, check n-k+1 window, find maximum element
            if(!deque.isEmpty() && deque.getFirst() <= right-k){
                deque.removeFirst();
            }
            while(!deque.isEmpty() && nums[right] >= nums[deque.getLast()] ){
                deque.removeLast();
            }
            deque.addLast(right);
            if(right >= k-1){
                result[right-k+1]=nums[deque.getFirst()];
            }
        }
        return result;
    }
}
