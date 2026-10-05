class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        // Map<Integer,Integer> map = new HashMap<>();
        // for(int n: nums){
        //     map.put(n, map.getOrDefault(n,0)+1);
        // }
        // List<Map.Entry<Integer, Integer>> entries = new ArrayList<>(map.entrySet());
        // entries.sort((a, b) -> b.getValue() - a.getValue());
        // int[] result  = new int[k];
        // for(int i=0; i<k;i++){
        //     result[i]=entries.get(i).getKey();
        // }
        // return result;


        // Solution 2: Priority Queue
        Map<Integer, Integer> map = new HashMap<>();
        PriorityQueue<Map.Entry<Integer, Integer>> pq =
        new PriorityQueue<>(
            (a, b) -> Integer.compare(a.getValue(), b.getValue())
        );
        for(int n: nums){
            map.put(n, map.getOrDefault(n,0)+1);
        }

        for(Map.Entry<Integer,Integer> entry: map.entrySet()){
            pq.add(entry);
            if(pq.size() > k){
                pq.poll();
            }
        }
        int[] result = new int[k];
        for(int i=0; i<k;i++){
            result[i]=pq.poll().getKey();
        }

        return result;



    }
}
