class Solution {
    public int lengthOfLongestSubstring(String s) {
    int result = 0;

    for (int i = 0; i < s.length(); i++) {
        Set<Character> set = new HashSet<>();

        for (int j = i; j < s.length(); j++) {
            char c = s.charAt(j);

            if (set.contains(c)) {
                break;
            }

            set.add(c);
            result = Math.max(result, j - i + 1);
        }
    }

    return result;
    }
}
