class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        ArrayList<Integer> al=new ArrayList<>();
        ArrayList<Integer> retAl=new ArrayList<>();

        for(int i=0;i<nums1.length;i++){
            al.add(nums1[i]);
        }
        for(int i=0;i<nums2.length;i++){
            if(al.contains(nums2[i])){
                al.remove(Integer.valueOf(nums2[i]));
                retAl.add(nums2[i]);
            }
        }
        int arr[]=new int[retAl.size()];
        for(int i=0;i<arr.length;i++){
            arr[i]=retAl.get(i);
        }
        return arr;
    }
}