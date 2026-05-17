class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int m = s1.length();
        if(m>s2.length()) return false;
        int freq1[] = new int[26];
        int freq2[] = new int[26];
        for(int i=0;i<m;i++){
            freq1[s1.charAt(i)-'a']++;
            freq2[s2.charAt(i)-'a']++;
        }
        int cnt = 0;
        for(int i=0;i<26;i++){
            if(freq1[i]==freq2[i]){
                cnt++;
            }
        }
        if(cnt==26) return true;
        int j = 0;
        for(int i=m;i<s2.length();i++){
            freq2[s2.charAt(j)-'a']--;
            freq2[s2.charAt(i)-'a']++;
            cnt = 0;
            for(int k=0;k<26;k++){
                if(freq1[k]==freq2[k]){
                    cnt++;
                }
            }
            if(cnt==26) return true;
            j++;
        }
        return false;
    }
}
