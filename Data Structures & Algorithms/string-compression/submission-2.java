class Solution {
    public int compress(char[] chars) {
        int k = 0, n = chars.length;
        for(int i=0;i<n;i++){
            char c = chars[i];
            int j = i+1, cnt = 1;
            while(j<n && c==chars[j]){
                j++;
                cnt++;
            }
            i = j-1;
            chars[k++] = c;
            int x = 0;
            StringBuilder sb = new StringBuilder();
            while(cnt>0){
                x = x*10 + cnt%10;
                sb.append(cnt%10);
                cnt/=10;
            }
            if(sb.length()>1 || (sb.length()==1 && sb.charAt(0)!='1')){
                for(j=sb.length()-1;j>=0;j--){
                    chars[k++] = sb.charAt(j);
                }
            }
        }
        return k;
    }
}