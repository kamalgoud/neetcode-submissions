class Solution {
    public boolean isPalindrome(String s) {
        int n = s.length();
        int i = 0, j = n-1;
        while(i<j){
            char c1 = Character.toLowerCase(s.charAt(i)), c2 = Character.toLowerCase(s.charAt(j));
            boolean a = false, b = false;
            if((c1>='0' && c1<='9') || (c1>='a' && c1<='z') || (c1>='A' && c1<='Z')){
                a = true;
            }
            if((c2>='0' && c2<='9') || (c2>='a' && c2<='z') || (c2>='A' && c2<='Z')){
                b = true;
            }
            if(!a){
                i++;
                continue;
            }
            if(!b){
                j--;
                continue;
            }
            if(c1!=c2) return false;
            i++;
            j--;
        }
        return true;
    }
}
