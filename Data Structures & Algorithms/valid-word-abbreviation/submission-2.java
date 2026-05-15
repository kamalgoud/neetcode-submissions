class Solution {
    public boolean validWordAbbreviation(String word, String abbr) {
        int m = word.length(), n = abbr.length();
        int i = 0, j = 0;
        while(i<m && j<n){
            if(word.charAt(i)==abbr.charAt(j)){
                i++;
                j++;
            }
            else{
                int sum = 0;
                int x = j;
                if(abbr.charAt(j)>='0' && abbr.charAt(j)<='9'){
                    while(j<n && abbr.charAt(j)>='0' && abbr.charAt(j)<='9'){
                        if(j>x && sum==0){
                            return false;
                        }
                        sum *= 10;
                        sum += Integer.parseInt(Character.toString(abbr.charAt(j)));
                        j++;
                    }
                    if(sum>m-i){
                        return false;
                    }
                    i+=sum;
                }
                else{
                    return false;
                }
            }
        }
        if(i<m || j<n) return false;
        return true;
    }
}