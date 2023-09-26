class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        //int arr[]=new int[nums1.length+nums2.length];
        ArrayList<Integer> arr=new ArrayList<>();
        

        for(int i=0;i<nums1.length;i++){
            //arr[i]=nums1[i];
            arr.add(nums1[i]);
        }
        for(int i=0;i<nums2.length;i++){
            //arr[nums1.length+i]=nums2[i];
            arr.add(nums2[i]);
        }
        //Arrays.sort(arr);
        Collections.sort(arr);

        //if(arr.length%2!=0){
        if(arr.size()%2!=0){
            //return arr[arr.length/2];
            return arr.get(arr.size()/2);
        }else{
            //double ret=arr[arr.length/2]+arr[(arr.length-1)/2];
            //return ret/2;
            double ptr1=arr.get(arr.size()/2);
            double ptr2=arr.get((arr.size()-1)/2);

            return (ptr1+ptr2)/2;
        }

    }
}