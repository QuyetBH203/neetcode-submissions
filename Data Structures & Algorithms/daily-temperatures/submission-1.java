class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        // Solution 1: brute force
        // int n = temperatures.length;
        // int[] result = new int[n];
        // for(int i=0;i <n-1;i++){
        //     for(int j=i+1; j<n;j++){
        //         if(temperatures[j]>temperatures[i]){
        //             result[i]=j-i;
        //             break;
        //         }
        //     }
        // }
        // return result;

        // Input: temperatures = [30,38,30,36,35,40,28]

        // Output: [1,4,1,2,1,0,0]

        //Solution 2: More Optimize
        int n = temperatures.length;
        int[] result = new int[n];
        Stack<int[]> stack = new Stack<>();
        for(int i=0; i<n;i++){
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
