class Solution {
    public boolean validWordAbbreviation(String word, String abbr) {
        int m = word.length(), n = abbr.length();
        int i = 0, j = 0;
        while(i<m && j<n){
            char c1 = word.charAt(i), c2 = abbr.charAt(j);
            if(c2>='0' && c2<='9'){
                StringBuilder sb = new StringBuilder();
                while(j<n && abbr.charAt(j)>='0' && abbr.charAt(j)<='9'){
                    sb.append(abbr.charAt(j));
                    j++;
                }
                if(sb.charAt(0)=='0') return false;
                int x = Integer.parseInt(sb.toString());
                i = i+x;
                if(i>m || (i==m && j<n)){
                    return false;
                }
            }
            else{
                if(c1!=c2){
                    return false;
                }
                i++;
                j++;
            }
        }
        return true;
    }
}