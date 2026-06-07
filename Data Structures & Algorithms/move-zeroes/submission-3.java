class Solution {
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        int i = 0, j = 0;
        while(i<n && j<n){
            while(i<n && nums[i]>0){
                i++;
            }
            while(j<n && nums[j]==0){
                j++;
            }
            if(i<n && j<n && i<j && nums[j]>0){
                swap(i, j, nums);
                i++;
                j++;
            }
            else if(i<n && j<n && i>j && nums[j]>0 && nums[i]==0){
                j++;
            }
        }
    }
    void swap(int i, int j, int nums[]){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}