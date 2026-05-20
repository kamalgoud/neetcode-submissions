class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        int[] res = new int[n-k+1];
        PriorityQueue<Integer> q = new PriorityQueue<>((a,b)->{
            return b-a;
        });
        int j = 0;
        for(int i=0;i<n;i++){
            q.offer(nums[i]);
            if(i>=k-1){
                res[j] = q.peek();
                q.remove(nums[j]);
                j++;
            }
        }
        return res;
    }
}
