class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
        return fun(nums, k)-fun(nums, k-1);
    }
    int fun(int[] nums, int k){
        int n = nums.length;
        int l = 0, res = 0;
        HashMap<Integer, Integer> h = new HashMap<>();
        for(int r=0;r<n;r++){
            h.put(nums[r], h.getOrDefault(nums[r],0)+1);
            while(l<=r && h.size()>k){
                h.put(nums[l], h.get(nums[l])-1);
                if(h.get(nums[l])==0){
                    h.remove(nums[l]);
                }
                l++;
            }
            res += (r-l+1);
        }
        return res;
    }
}