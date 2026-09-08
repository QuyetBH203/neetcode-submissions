class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> map = new HashMap<>();
        for(String s: strs){
            int[] count = new int[26];
            for(char c: s.toCharArray()){
                count[c-'a']++;
            }
            String res = Arrays.toString(count);
            if(!map.containsKey(res)){
                map.put(res, new ArrayList<>());
            }
            map.get(res).add(s);
        }
        return new ArrayList<>(map.values());
    }
}
