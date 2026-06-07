class Solution {
    public int numSubseq(int[] nums, int target) {
        Arrays.sort(nums);
        long res = 0;
        int n = nums.length;
        int mod = 1000000007;
        long pow[] = new long[n];
        pow[0]=1;
        for(int i=1;i<n;i++){
            pow[i] = (pow[i-1]*2)%mod;
        }
        int i = 0, j = n-1;
        while(i<=j){
            if(nums[i]+nums[j]<=target){
                res = (res%mod + pow[j-i]%mod)%mod;
                i++;
            }
            else{
                j--;
            }
        }
        res = res%mod;
        return (int)res;
    }
}