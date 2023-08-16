class Solution {
    public int[] shuffle(int[] nums, int n) {
        int temp1=0;
        int temp2=n;
        int arr[]=new int[2*n];
        for(int i=0;i<2*n-1;i++){
            arr[i++]=nums[temp1];
            arr[i]=nums[temp2];
            temp1++;;
            temp2++;
        }
        return arr;
    }
}