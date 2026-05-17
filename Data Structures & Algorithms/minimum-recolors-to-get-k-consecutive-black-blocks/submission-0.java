class Solution {
    public int minimumRecolors(String blocks, int k) {
        int cntB = 0;
        int n = blocks.length();
        for(int i=0;i<k;i++){
            if(blocks.charAt(i)=='B'){
                cntB++;
            }
        }
        int res = Math.max(0, k-cntB);
        int j = 0;
        for(int i=k;i<n;i++){
            if(blocks.charAt(j++)=='B'){
                cntB--;
            }
            if(blocks.charAt(i)=='B'){
                cntB++;
            }
            res = Math.min(res, Math.max(0,k-cntB));
        }
        return res;
    }
}