class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        int l=-1, h = -1;
        for(int i=0;i<n;i++){
            if(nums[i]==0 || (i>0 && nums[i]>=0 && nums[i-1]<0) || (i==n-1 && nums[i]<0) || (i==0 && nums[i]>=0)){
                l = i-1;
                h = i;
                break;
            }
        }
        int x = 0;
        while(l>=0 && h<n){
            if(Math.abs(nums[l])<=Math.abs(nums[h])){
                res[x++] = nums[l]*nums[l];
                l--;
            }
            else{
                res[x++] = nums[h]*nums[h];
                h++;
            }
        }
        while(l>=0){
            res[x++] = nums[l]*nums[l];
            l--;
        }
        while(h<n){
            res[x++] = nums[h]*nums[h];
            h++;
        }
        return res;
    }
}