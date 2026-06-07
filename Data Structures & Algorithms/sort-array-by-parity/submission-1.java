class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int n = nums.length, i = 0, j = 0;
        while(i<n && j<n){
            while(i<n && nums[i]%2==0){
                i++;
            }
            while(j<n && nums[j]%2!=0){
                j++;
            }
            if(i<n && j<n && i<j){
                swap(i, j, nums);
                i++;
                j++;
            }
            else if(i<n && j<n && i>j){
                j++;
            }
        }
        return nums;
    }
    void swap(int a, int b, int[] nums){
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
}