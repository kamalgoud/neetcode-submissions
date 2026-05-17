class Solution {
    public int totalFruit(int[] fruits) {
        int n = fruits.length;
        int j = 0;
        int res = 0;
        HashMap<Integer, Integer> h = new HashMap<>();
        for(int i=0;i<n;i++){
            h.put(fruits[i], h.getOrDefault(fruits[i],0)+1);
            while(h.size()>2){
                h.put(fruits[j], h.get(fruits[j])-1);
                if(h.get(fruits[j])==0){
                    h.remove(fruits[j]);
                }
                j++;
            }
            // System.out.println(i+" "+j+" "+h);
            res = Math.max(res, i-j+1);
        }
        return res;
    }
}