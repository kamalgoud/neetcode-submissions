class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int n = nums.length;
        if(k<=1) return 0;
        int l = 0, prod = 1, res = 0;
        for(int r = 0;r<n;r++){
            prod = prod*nums[r];
            while(l<n && prod>=k){
                prod = prod/nums[l];
                l++;
            }
            if(prod<k){
                res += r-l+1;
            }
        }
        return res;
    }
}