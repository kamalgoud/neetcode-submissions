class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        List<Integer> l = new ArrayList<>();
        int n = arr.length;
        for(int i = 0;i<n;i++){
            l.add(Math.abs(arr[i]-x));
        }
        int res = Integer.MAX_VALUE, startInd = 0;
        int sum = 0, j = 0;
        // System.out.println(l);
        for(int i=0;i<n;i++){
            sum += l.get(i);
            if(i>=k-1 && sum<res){
                res = sum;
                startInd = j;
            }
            if(i>=k-1){
                sum -= l.get(j++);
            }
        }
        List<Integer> r = new ArrayList<>();
        for(int i=startInd;i<startInd+k;i++){
            r.add(arr[i]);
        }
        return r;
    }
}