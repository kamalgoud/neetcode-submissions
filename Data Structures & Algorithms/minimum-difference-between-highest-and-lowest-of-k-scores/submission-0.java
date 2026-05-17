class Solution {
    public int minimumDifference(int[] nums, int k) {
        Arrays.sort(nums);
        int n = nums.length;
        int l = nums[0], r = nums[k-1];
        int max = r-l;
        int j = 0;
        for(int i=k;i<n;i++){
            l = nums[j+1];
            r = nums[i];
            max = Math.min(max, r-l);
            j++;
        }
        return max;
    }
}