class Solution {
    public int maxScore(String s) {
        int n= s.length();
        int[] prefSum = new int[n+1];
        prefSum[0]=0;
        for(int i=1;i <= n;i++){
            prefSum[i]=prefSum[i-1]+(s.charAt(i-1)-'0');
        }
        Integer result = Integer.MIN_VALUE;
        for(int i=1;i<n;i++){
            Integer left = i -(prefSum[i]/1);
            Integer right = (prefSum[n]-prefSum[i])/1;
            result = Math.max(result, left+right);
        }
        return result;
    }

}