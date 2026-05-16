class Solution {
    public int numRescueBoats(int[] people, int limit) {
        int n = people.length;
        int r = n-1, res = 0;;
        Arrays.sort(people);
        int l = 0;
        while(l<=r){
            if(l==r){
                res++;
                break;
            }
            if(people[l]+people[r]<=limit){
                res++;
                l++;
                r--;
            }
            else{
                r--;
                res++;
            }
        }
        return res;
    }
}