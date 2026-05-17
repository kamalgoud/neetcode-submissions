class Solution {
    public int maxFrequency(int[] nums, int k) {
        Arrays.sort(nums);
        int n = nums.length;
        int max = 0, sum = 0;
        int j = 0, i = 0;
        while(i<n){
            int val = nums[i];
            sum += nums[i];
            // System.out.println(i+" "+j+" "+val+" "+sum);
            if(val*(i-j+1)-sum<=k){
                max = Math.max(max, i-j+1);
                i++;
            }
            else{
                sum -= nums[j];
                sum -= nums[i];
                j++;
            }
        }
        return max;
    }
}