class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character,Integer> map1= new TreeMap<>();
        Map<Character,Integer> map2 = new TreeMap<>();
        for(int i=0; i< s.length();i++){
            char c = s.charAt(i);
            map1.put(c, map1.getOrDefault(c,0)+1);
        }
        for(int i=0;i< t.length();i++){
            char c = t.charAt(i);
            map2.put(c, map2.getOrDefault(c,0)+1);
        }
        if(map1.size() != map2.size()){
            return false;
        }
        List<Character> arr = new ArrayList<>(map1.keySet());
        for(Character r: arr){
            if(!map2.containsKey(r)){
                return false;
            }
        }
        for(Character r: arr){
            Integer num = map2.get(r);
            if(!num.equals(map1.get(r))){
                return false;
            }
        }
        return true;

    }
}
