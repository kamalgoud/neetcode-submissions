class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> h = new HashMap<>();
        int n = s.length();
        int j = 0, res = 0;
        for(int i=0;i<n;i++){
            if(!h.containsKey(s.charAt(i))){
                h.put(s.charAt(i), i);
            }
            else{
                j = Math.max(j, h.get(s.charAt(i))+1);
                h.put(s.charAt(i), i);
            }
            res = Math.max(res, i-j+1);
        }
        return res;
    }
}
