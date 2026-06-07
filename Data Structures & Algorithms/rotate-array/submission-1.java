class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k%n;
        if(k==0) return;
        int i = n-k, j = n-1;
        while(i<j){
            swap(i, j, nums);
            i++;
            j--;
        }
        i = 0;
        j = n-k-1;
        while(i<j){
            swap(i, j, nums);
            i++;
            j--;
        }
        i = 0;
        j = n-1;
        while(i<j){
            swap(i, j, nums);
            i++;
            j--;
        }
    }
    void swap(int i, int j, int nums[]){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}