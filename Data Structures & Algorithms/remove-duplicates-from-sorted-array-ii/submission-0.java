class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length, k = 0;
        for(int i = 0;i<n;i++){
            int val = nums[i], cnt = 0, j = i;
            while(j<n && nums[j]==val){
                if(cnt<2){
                    nums[k++] = val;
                }
                cnt++;
                j++;
            }
            i = j-1;
        }
        return k;
    }
}