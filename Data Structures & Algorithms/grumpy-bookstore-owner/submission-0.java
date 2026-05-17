class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        int n = customers.length;
        int[] left = new int[n];
        int right[] = new int[n];
        for(int i=1;i<n;i++){
            left[i] += left[i-1] + ((grumpy[i-1]==1?0:customers[i-1]));
            right[n-i-1] += right[n-i] + ((grumpy[n-i]==1?0:customers[n-i]));
        }
        int res = 0, sum = 0;
        for(int i=0;i<minutes;i++){
            sum += customers[i];
        }
        res = sum + right[minutes-1];
        int j = 0;
        for(int i=minutes;i<n;i++){
            sum -= customers[j++];
            sum += customers[i];
            if(sum+left[j]+right[i]>res){
                res = sum+left[j]+right[i];
            }
        }
        return res;
    }
}