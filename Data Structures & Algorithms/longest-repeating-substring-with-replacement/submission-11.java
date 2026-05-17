class Solution {
    public int characterReplacement(String s, int k) {
        int n = s.length();
        int max = 0, j = 0;
        int[] freq = new int[26];
        int res = 0;
        for(int i=0;i<n;i++){
            char c = s.charAt(i);
            freq[c-'A']++;
            max = Math.max(max, freq[c-'A']);
            while(i-j+1-max>k){
                char c2 = s.charAt(j);
                freq[c2-'A']--;
                j++;
            }
            res = Math.max(res, i-j+1);
        }
        return res;
    }
}
