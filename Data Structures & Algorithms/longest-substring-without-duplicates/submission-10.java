class Solution {
    public int lengthOfLongestSubstring(String s) {
        // gap ky tu trung o phia ben phai cac phan tu left -> n-1 vi pham
        // remove left in set va thay doi vi tri cua left, xet cac xau con 
        // new_left -> right =n-1 
        int left =0;
        int result =0;
        Set<Character> set = new HashSet<>();
        for(int right =0; right < s.length();right++){
            while(set.contains(s.charAt(right))){
                set.remove(s.charAt(left));
                left++;

            }
            set.add(s.charAt(right));
            result = Math.max(result, right-left+1);
        }
        return result;
    }
}
