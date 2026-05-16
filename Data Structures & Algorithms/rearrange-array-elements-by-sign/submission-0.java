class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        int l = -1, r = -1;
        for(int i=0;i<n;i++){
            if(nums[i]>0 && l==-1){
                l = i;
            }
            else if(nums[i]<0 && r==-1){
                r = i;
            }
            if(l!=-1 && r!=-1) break;
        }
        for(int k=0;k<n;k++){
            if(k%2==0){
                res[k] = nums[l];
                l++;
                while(l<n && nums[l]<0){
                    l++;
                }
            }
            else{
                res[k] = nums[r];
                r++;
                while(r<n && nums[r]>0){
                    r++;
                }
            }
        }
        return res;
    }
}