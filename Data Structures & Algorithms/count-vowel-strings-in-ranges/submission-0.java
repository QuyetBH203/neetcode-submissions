class Solution {
    public int[] vowelStrings(String[] words, int[][] queries) {
        String vowel ="aeiou";
        int n = words.length;
        int[] nums = new int[n];
        // for(String s: words){
        // boolean bothAreVowels =
        //     vowels.indexOf(s.charAt(0)) != -1 &&
        //     vowels.indexOf(s.charAt(s.length() - 1)) != -1;
        //     if(bothAreVowels){

        //     }

        // }
        for(int i=0; i< words.length; i++){
            boolean bothAreVowels =
                vowel.indexOf(words[i].charAt(0)) != -1 &&
                vowel.indexOf(words[i].charAt(words[i].length() - 1)) != -1;
           if(bothAreVowels){
            nums[i]=1;
           }else{
            nums[i]=0;
           }
        }
        int[] prefSum = new int[n+1];
        prefSum[0]=0;
        for(int i=1;i<= n;i++){
            prefSum[i]=prefSum[i-1]+nums[i-1];
        }
        // System.out.println(prefSum[3]);
        int[] result = new int[queries.length];
        for(int i=0; i< queries.length;i++){
            result[i]=prefSum[queries[i][1]+1]-prefSum[queries[i][0]];
        }
        return result;
    }
}