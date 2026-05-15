class Solution {
    public boolean validPalindrome(String s) {
        int n = s.length();
        int i = 0, j = n-1;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
                if(fun(s, i+1,j) || fun(s, i, j-1)){
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
    boolean fun(String s, int a, int b){
        while(a<b){
            if(s.charAt(a)!=s.charAt(b)){
                return false;
            }
            a++;
            b--;
        }
        return true;
    }
}