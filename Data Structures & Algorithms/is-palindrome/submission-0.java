class Solution {
    public boolean isPalindrome(String s) {
        String[] arr = s.split("[^a-zA-Z0-9]+");
        StringBuilder tmp = new StringBuilder();
        for(String str: arr){
            tmp.append(str.toLowerCase());
        }
        char[] ans = tmp.toString().toCharArray();
        int i =0, j= ans.length-1;
        while(i<j){
            if(ans[i] != ans[j]){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
