class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> h = new HashMap<>();
        int n = nums.length;
        for(int i=0;i<n;i++){
            if(h.containsKey(nums[i]) && i-h.get(nums[i])<=k){
                return true;
            }
            h.put(nums[i], i);
        }
        return false;
    }
}