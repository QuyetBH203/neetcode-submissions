class Solution {
    public String longestCommonPrefix(String[] strs) {
       String prefix = strs[0];
       for(int i =0; i < prefix.length();i++){
         for(String s: strs){
            if(i >= s.length() || s.charAt(i) != prefix.charAt(i) ){
                return prefix.substring(0,i);
            }
         }
       }
       return prefix;

    }
}