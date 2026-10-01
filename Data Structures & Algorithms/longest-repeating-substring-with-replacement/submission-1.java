class Solution {
    public int characterReplacement(String s, int k) {
        // int result =0;
        // int n = s.length();
        // for(int i=0;i < n;i++){
        //     int[] freq = new int[26];
        //     int maxFreq =0;
        //     for(int j=i; j < n; j++ ){
        //         int tmp = s.charAt(j) -'A';
        //         freq[tmp]++;
        //         maxFreq = Math.max(maxFreq, freq[tmp]);
        //         int lenSub =j-i+1;
        //         if(lenSub-maxFreq <= k){
        //             result = Math.max(lenSub, result);
        //         }
        //     }

        // }

        // return result;
        int n = s.length();
        int[] freq = new int[26];

        int left = 0;
        int maxFreq = 0;
        int result = 0;

        for (int right = 0; right < n; right++) {
            int idx = s.charAt(right) - 'A';
            freq[idx]++;

            maxFreq = Math.max(maxFreq, freq[idx]);

            while ((right - left + 1) - maxFreq > k) {
                freq[s.charAt(left) - 'A']--;
                left++;
            }

            result = Math.max(result, right - left + 1);
        }

        return result;
    }
}
