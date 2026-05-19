class Solution {
    public int longestOnes(int[] nums, int k) {
        int n = nums.length;
        int cnt1 = 0, res = 0;
        int j = 0;
        for(int i=0;i<n;i++){
            if(nums[i]==1) cnt1++;
            while(j<=i && i-j+1-cnt1>k){
                if(nums[j]==1){
                    cnt1--;
                }
                j++;
            }
            res = Math.max(res, i-j+1);
        }
        return res;
    }
}