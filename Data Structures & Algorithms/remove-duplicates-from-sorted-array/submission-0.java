class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        int write = 0, i = 0;
        while(i<n){
            int val = nums[i];
            int cnt = 0;
            while(i<n && nums[i]==val){
                if(cnt<1){
                    nums[write++] = val;
                }
                i++;
                cnt++;
            }
        }
        return write;
    }
}