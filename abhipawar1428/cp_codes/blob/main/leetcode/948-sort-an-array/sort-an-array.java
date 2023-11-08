class Solution {
    public int[] sortArray(int[] nums) {
        int start=0;
        int end=nums.length-1;
        mergeSort(nums,start,end);
        return nums;
    }
    static void mergeSort(int[] nums,int start,int end){
        if(start<end){
            int mid=start+(end-start)/2;
            mergeSort(nums,start,mid);
            mergeSort(nums,mid+1,end);
            merge(nums,start,mid,end);
        }
    }
    static void merge(int[] nums,int start,int mid,int end){
        int n1=mid-start+1;
        int n2=end-mid;

        int arr1[]=new int[n1];
        int arr2[]=new int[n2];

        for(int p=0;p<n1;p++){
            arr1[p]=nums[start+p];
        }
        for(int p=0;p<n2;p++){
            arr2[p]=nums[mid+1+p];
        }

        int i=0,j=0,k=start;
        while(i<n1 && j<n2){
            if(arr1[i]<arr2[j]){
                nums[k]=arr1[i];
                i++;
            }else{
                nums[k]=arr2[j];
                j++;
            }
            k++;
        }
        while(i<n1){
            nums[k]=arr1[i];
            i++;
            k++;
        }
        while(j<n2){
            nums[k]=arr2[j];
            j++;
            k++;
        }
    }
}