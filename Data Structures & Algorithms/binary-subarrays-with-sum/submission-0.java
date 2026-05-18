class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        int n = nums.length;
        int res = 0;
        for(int i=0;i<nums.length;i++){
            int sum = 0;
            for(int j=i;j<n;j++){
                sum += nums[j];
                if(sum==goal){
                    res++;
                }
                else if(sum>goal){
                    break;
                }
            }
        }
        return res;
    }
}