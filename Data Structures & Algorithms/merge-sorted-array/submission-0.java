class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i=0, j=0;
        List<Integer> result = new ArrayList<>();
        while(i <m || j<n){
            if(j==n || (i < m && nums1[i] < nums2[j])){
                result.add(nums1[i]);
                i++;
            }else{
                result.add(nums2[j]);
                j++;
            }
            

        }
        for(int t=0; t < n+m;t++){
            nums1[t]=result.get(t);
        }
    }
}