class Solution {
    public int maxArea(int[] heights) {
        int n = heights.length;
        int res = 0;
        int l = 0, h = n-1;
        while(l<h){
            int val = (h-l)*Math.min(heights[l], heights[h]);
            res = Math.max(res, val);
            if(heights[l]<=heights[h]){
                l++;
            }
            else{
                h--;
            }
        }
        return res;
    }
}
