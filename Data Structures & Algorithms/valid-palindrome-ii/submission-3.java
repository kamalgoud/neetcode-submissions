class Solution {
    public boolean validPalindrome(String s) {
        int i = 0,  j = s.length()-1;
        boolean used = false;
        while(i<j){
            char c1 = Character.toLowerCase(s.charAt(i)), c2 = Character.toLowerCase(s.charAt(j));
            if(c1!=c2){
                if(check(s, i+1, j) || check(s, i, j-1)){
                    return true;
                }
                else{
                    return false;
                }
            }
            i++;
            j--;
        }
        return true;
    }
    boolean check(String s, int i, int j){
        while(i<j){
            char c1 = Character.toLowerCase(s.charAt(i)), c2 = Character.toLowerCase(s.charAt(j));
            if(c1!=c2){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}