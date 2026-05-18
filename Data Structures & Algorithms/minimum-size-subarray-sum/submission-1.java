class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int max = Integer.MAX_VALUE;
        int n = nums.length, sum = 0 , j = 0;
        for(int i=0;i<n;i++){
            sum += nums[i];
            while(j<=i && sum>=target){
                max = Math.min(max, i-j+1);
                sum -= nums[j++];
            }
        }
        return (max==Integer.MAX_VALUE)?0:max;
    }
}