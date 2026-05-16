class Solution {
    public int numSubseq(int[] nums, int target) {
        int n = nums.length;
        Arrays.sort(nums);
        int pow[] = new int[n];
        pow[0] = 1;
        for(int i=1;i<n;i++){
            pow[i] = (pow[i-1]*2)%(1000000007);
        }
        int l = 0, h = n-1;
        int res = 0;
        while(l<=h){
            if(nums[l]+nums[h]<=target){
                res = (res+pow[h-l])%(1000000007);
                l++;
            }
            else{
                h--;
            }
        }
        return res%(1000000007);
    }
}