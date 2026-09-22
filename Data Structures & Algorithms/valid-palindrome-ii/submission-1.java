class Solution {
    public boolean validPalindrome(String s) {
         int i =0, j= s.length()-1;
         int n= s.length();
         while(i<j){
            if(s.charAt(i) != s.charAt(j)){
                boolean isValid =isValidPalindrome(s.substring(0,i)+s.substring(i+1,n)) || isValidPalindrome(s.substring(0,j)+s.substring(j+1,n));
                return isValid;
            }
            i++;
            j--;
         }
         return true;

    }


    public boolean isValidPalindrome(String s){
        int i=0, j=s.length()-1;
        while(i<j){
            if(s.charAt(i) != s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}