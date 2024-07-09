class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int ret[]=new int[m+n];
        int i=0,j=0,k=0;
        while(i<m && j<n){
            if(nums1[i]<nums2[j]){
                ret[k]=nums1[i];
                i++;
                k++;
            }else{
                ret[k]=nums2[j];
                j++;
                k++;
            }
        }
        while(i<m){
            ret[k++]=nums1[i++];
        }
        while(j<n){
            ret[k++]=nums2[j++];
        }
        i=0;
        for(int num:ret){
            nums1[i++]=num;
        }
    }
}