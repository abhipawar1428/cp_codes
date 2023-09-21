class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int peak=0;
        for(int i=0;i<arr.length;i++){
            if(arr[peak]<arr[i]){
                peak=i;
            }
        }
        return peak;
    }
}