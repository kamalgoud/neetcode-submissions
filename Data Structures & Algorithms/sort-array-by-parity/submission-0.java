class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int n = nums.length;
        int res[] = new int[n];
        int i = 0, j = n-1, k = 0;
        while(k<n && i<=j){
            if(nums[k]%2==0){
                res[i++] = nums[k++];
            }
            else{
                res[j--] = nums[k++];
            }
        }
        return res;
    }
}