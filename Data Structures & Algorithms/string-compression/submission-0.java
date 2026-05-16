class Solution {
    public int compress(char[] chars) {
        int n = chars.length;
        int write = 0, i = 0;
        Stack<Integer> st = new Stack<>();
        while(i<n){
            char val = chars[i];
            int cnt = 0;
            while(i<n && chars[i]==val){
                if(cnt<1){
                    chars[write++] = val;
                }
                cnt++;
                i++;
            }
            if(cnt>1){
                while(cnt>0){
                    st.push(cnt%10);
                    cnt/=10;
                }
            }
            while(!st.isEmpty()){
                System.out.println(st.peek());
                chars[write++] = (Integer.toString(st.pop())).charAt(0);
            }
        }
        return write;
    }
}