class Solution {
    public int[] sortedSquares(int[] nums) {
        int ind = 0, n = nums.length;
        while(ind<n && nums[ind]<0){
            ind++;
        }
        int i = ind-1, j = ind;
        int[] res = new int[n];
        int k = 0;
        while(i>=0 && j<n){
            if(Math.abs(nums[i])>Math.abs(nums[j])){
                res[k++] = nums[j++];
            }
            else{
                res[k++] = nums[i--];
            }
        }
        while(i>=0){
            res[k++] = nums[i--];
        }
        while(j<n){
            res[k++] = nums[j++];
        }
        for(i=0;i<n;i++){
            res[i] *= res[i];
        }
        return res;
    }
}