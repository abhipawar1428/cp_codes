class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        ArrayList<Integer> al=new ArrayList<>();

        for(int num:nums){
            if(!set.add(num)){
                al.add(num);
            }
        }
        return al;
    }
}