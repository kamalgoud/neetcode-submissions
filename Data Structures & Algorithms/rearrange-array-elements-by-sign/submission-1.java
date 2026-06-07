class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        int k = 0, i = 0, j = 0;
        while(i<n && j<n){
            while(i<n && nums[i]<0){
                i++;
            }
            while(j<n && nums[j]>0){
                j++;
            }
            res[k++] = nums[i++];
            res[k++] = nums[j++];
        }
        return res;
    }
}