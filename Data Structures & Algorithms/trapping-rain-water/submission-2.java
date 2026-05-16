class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int[] left = new int[n];
        int[] right = new int[n];
        for(int i=1;i<n;i++){
            left[i] = Math.max(left[i-1], height[i-1]);
            right[n-i-1] = Math.max(right[n-i], height[n-i]);
        }
        int sum = 0;
        for(int i=1;i<n-1;i++){
            int minH = Math.min(left[i], right[i]);
            sum += Math.max(minH-height[i], 0);
        }
        return sum;
    }
}
