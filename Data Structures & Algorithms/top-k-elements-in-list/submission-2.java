class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int num: nums){
            map.put(num, map.getOrDefault(num,0)+1);
        }
        List<Integer>[] frequent = new ArrayList[nums.length+1];
        for(Map.Entry<Integer,Integer> entry: map.entrySet()){
            int occur = entry.getValue();
            int sig = entry.getKey();
            if(frequent[occur] == null){
                frequent[occur]= new ArrayList<>();
            }
            frequent[occur].add(sig);
        }
        int[] result = new int[k];
        int res =0;
        for(int i =nums.length; i >= 1; i--){
            if(frequent[i] == null){
                continue;
            }
            for(int j: frequent[i]){
                result[res++]=j;
                if(res ==k){
                    return result;
                }
            }
        }
        return result;

    }
}
