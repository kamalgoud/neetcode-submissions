class Solution {
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        int cnt0 = 0;
        for(int i=0;i<n;i++){
            if(nums[i]==0) cnt0++;
        }
        if(cnt0==0 || cnt0==n) return;
        int j = 0;
        for(int i=0;i<n;i++){
            while(j<n && nums[j]!=0){
                j++;
            }
            if(nums[i]!=0 && i>j && nums[j]==0){
                nums[j] = nums[i];
                nums[i] = 0;
                j++;
            }
        }
    }
}