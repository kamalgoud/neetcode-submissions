class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        int n = nums.length;
        Arrays.sort(nums);
        for(int i=0;i<n-2;i++){
            if(i>0 && nums[i]==nums[i-1]){
                continue;
            }
            int l = i+1, h = n-1;
            while(l<h){
                int sum = nums[i]+nums[l]+nums[h];
                if(sum==0){
                    res.add(List.of(nums[i], nums[l], nums[h]));
                    l++;
                    h--;
                    while(l<n && nums[l]==nums[l-1]){
                        l++;
                    }
                    while(h>=0 && nums[h]==nums[h+1]){
                        h--;
                    }
                }
                else if(sum<0){
                    l++;
                }
                else{
                    h--;
                }
            }
        }
        return res;
    }
}
