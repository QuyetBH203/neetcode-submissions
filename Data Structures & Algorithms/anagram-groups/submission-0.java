class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> map = new HashMap<>();
        for(String s: strs){
            char[] arr = s.toCharArray();
            Arrays.sort(arr);
            String res = new String(arr);
            if(!map.containsKey(res)){
                map.put(res, new ArrayList<>());
            }
            map.get(res).add(s);
        }
        return new ArrayList<>(map.values());
    }
}
