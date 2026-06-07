class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        int k = 0;
        for(int i=0;i<n;i++){
            int val = nums[i], j = i+1;
            while(j<n && val==nums[j]){
                j++;
            }
            i = j-1;
            nums[k++] = val;
        }
        return k;
    }
}