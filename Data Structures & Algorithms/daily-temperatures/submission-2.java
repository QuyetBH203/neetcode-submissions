class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        // Stack 
        int n= temperatures.length;
        int[] result = new int[n];
        Stack<int[]> stack = new Stack<>();
        for(int i=0;i <n;i++){
            int t = temperatures[i];
            while(!stack.isEmpty() && t > stack.peek()[1]){
                int[] pair = stack.pop();
                result[pair[0]]=i-pair[0];

            }
            stack.push(new int[]{i,t});
        }

        return result;
    }
}
