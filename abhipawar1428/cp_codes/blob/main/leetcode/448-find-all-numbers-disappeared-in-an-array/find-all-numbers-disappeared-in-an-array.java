class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        Set<Integer> h=new HashSet<>();
        ArrayList<Integer> ret=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            h.add(nums[i]);
        }
        for(int i=0;i<nums.length;i++){
            if(h.add(i+1)){
                ret.add(i+1);
            }
        }
        return ret;

    }
}