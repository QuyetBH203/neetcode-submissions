class Solution {
    public int maxArea(int[] heights) {
        int result = Integer.MIN_VALUE;
        int i =0, j = heights.length-1;
        while(i<j){
            int height = Integer.min(heights[i],heights[j]);
            int area = (j-i)*height;
            result = Math.max(result, area);
            if(heights[i]<heights[j]){
                i++;
            }else{
                j--;
            }
        }
        return result;
    }
}
