class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set=new HashSet<>();
        HashSet<Integer> retSet=new HashSet<>();

        for(int i=0;i<nums1.length;i++){
            set.add(nums1[i]);
        }
        for(int i=0;i<nums2.length;i++){
            if(set.contains(nums2[i])){
                retSet.add(nums2[i]);
            }
        }
        int arr[]=new int[retSet.size()];
        int i=0;
        for(int num:retSet){
            arr[i]=num;
            i++;
        }
        return arr;

    }
}