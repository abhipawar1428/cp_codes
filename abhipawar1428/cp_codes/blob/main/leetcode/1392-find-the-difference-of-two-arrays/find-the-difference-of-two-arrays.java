class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> ret=new ArrayList<>();

        HashSet<Integer> set1=new HashSet<>();
        for(int i=0;i<nums1.length;i++){
            set1.add(nums1[i]);
        }

        HashSet<Integer> set2=new HashSet<>();
        for(int i=0;i<nums2.length;i++){
            set2.add(nums2[i]);
        }

        ArrayList<Integer> al=new ArrayList<>();
        for(int num:set1){
            if(!set2.contains(num)){
                al.add(num);
            }
        }
        ret.add(al);

        ArrayList<Integer> al2=new ArrayList<>();
        for(int num:set2){
            if(!set1.contains(num)){
                al2.add(num);
            }
        }
        ret.add(al2);
        return ret;
    }
}