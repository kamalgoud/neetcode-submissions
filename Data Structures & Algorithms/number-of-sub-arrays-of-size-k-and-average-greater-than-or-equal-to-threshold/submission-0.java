class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int sum = 0, n = arr.length, res = 0;
        for(int i=0;i<k;i++){
            sum += arr[i];
        }
        if(sum/k>=threshold) res++;
        int j = 0;
        for(int i=k;i<n;i++){
            sum -= arr[j++];
            sum += arr[i];
            if(sum/k>=threshold){
                res++;
            }
        }
        return res;
    }
}