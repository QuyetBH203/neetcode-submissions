class Solution {
    public int lengthOfLongestSubstring(String s) {
        // int result = 0;
        // for (int i = 0; i < s.length(); i++) {
        //     Set<Character> set = new HashSet<>();
        //     for (int j = i; j < s.length(); j++) {
        //         char c = s.charAt(j);
        //         if (set.contains(c)) {
        //             break;
        //         }

        //         set.add(c);
        //         result = Math.max(result, j - i + 1);
        //     }
        // }
        // return result;


        // Solution 2: more optimize, sliding window
        int result =0;
        int n= s.length();
        int left =0;
        Set<Character> set = new HashSet<>();
        for(int i=0; i < n;i++){
            char c = s.charAt(i);
            while(set.contains(c)){
                set.remove(s.charAt(left));
                left++;
            }
            set.add(c);
            result = Math.max(result, i-left+1);

        }
        return result;
    }
}
