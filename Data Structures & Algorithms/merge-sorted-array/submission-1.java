class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int j = 0, i = m;
        while(i<m+n){
            nums1[i++] = nums2[j++];
        }
        i = 0;
        j = m;
        while(i<j && j<m+n){
            while(i<j && nums1[j]>nums1[i]){
                i++;
            }
            if(i<j && nums1[j]<=nums1[i]){
                int x = nums1[j], k = j;
                while(k>i){
                    nums1[k] = nums1[k-1];
                    k--;
                }
                nums1[i] = x;
                i++;
                j++;
            }
        }
    }
}