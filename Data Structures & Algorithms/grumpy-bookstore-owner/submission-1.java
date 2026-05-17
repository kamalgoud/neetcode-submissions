class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        int n = customers.length;
        int res = 0, sum = 0;
        for(int i=0;i<n;i++){
            if(grumpy[i]==0){
                res += customers[i];
                sum += customers[i];
            } 
        }
        for(int i=0;i<minutes;i++){
            if(grumpy[i]==1){
                sum += customers[i];
            }
        }
        res = Math.max(sum, res);
        int j = 0;
        for(int i=minutes;i<n;i++){
            if(grumpy[j]==1){
                sum -= customers[j];
            }
            if(grumpy[i]==1){
                sum += customers[i];
            }
            res = Math.max(sum, res);
            j++;
        }
        return res;
    }
}