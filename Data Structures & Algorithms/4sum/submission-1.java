class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        int n = nums.length;
        for(int j=0;j<n-3;j++){
            if((j>0 && nums[j]==nums[j-1]) || nums[j]>target){
                continue;
            }
            for(int i=j+1;i<n-2;i++){
                if(i>j+1 && nums[i]==nums[i-1]){
                    continue;
                }
                int l = i+1, h = n-1;
                while(l<h){
                    int sum = nums[j]+nums[i]+nums[l]+nums[h];
                    if(sum==target){
                        res.add(List.of(nums[j], nums[i], nums[l], nums[h]));
                        l++;
                        h--;
                        while(l<n && nums[l]==nums[l-1]){
                            l++;
                        }
                        while(h>=0 && nums[h]==nums[h+1]){
                            h--;
                        }
                    }
                    else if(sum<target){
                        l++;
                    }
                    else{
                        h--;
                    }
                }
            }
        }
        return res;
    }
}