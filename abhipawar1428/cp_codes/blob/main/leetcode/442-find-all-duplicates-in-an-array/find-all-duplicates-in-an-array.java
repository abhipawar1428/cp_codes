class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        HashSet<Integer> hSet=new HashSet<>();
        ArrayList<Integer> al=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(!hSet.add(nums[i])){
                al.add(nums[i]);
            }
        }
        return al;
    }
}