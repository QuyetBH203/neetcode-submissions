class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int n = s1.length();
        int m = s2.length();
        if (n > m){
            return false;
        }
        int[] s1Freq = new int[26];
        int[] windowFreq = new int[26];
        for(int i=0; i<n;i++){
            s1Freq[s1.charAt(i) -'a']++;
            windowFreq[s2.charAt(i) - 'a']++;
        }

        if(Arrays.equals(s1Freq, windowFreq)){
            return true;
        }

        for(int right = n; right < m;right++){
            int left = right -n;
            windowFreq[s2.charAt(left)-'a']--;
            windowFreq[s2.charAt(right)-'a']++;
            if(Arrays.equals(s1Freq, windowFreq)){
                return true;
            }
        }

        return false;
    }
}
