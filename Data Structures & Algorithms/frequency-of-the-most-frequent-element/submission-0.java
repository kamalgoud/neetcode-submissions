class Solution {
    public int maxFrequency(int[] nums, int k) {
        Arrays.sort(nums);
        int n = nums.length;
        int max = 0;
        for(int i=n-1;i>=0;i--){
            int val = nums[i];
            int cnt = 1, buf = k;
            for(int j=i-1;j>=0;j--){
                if(nums[i]-nums[j]<=buf){
                    buf -= nums[i]-nums[j];
                    cnt++;
                }
                else{
                    break;
                }
            }
            max = Math.max(max, cnt);
        }
        return max;
    }
}