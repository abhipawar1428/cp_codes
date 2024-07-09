class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        //Arrays.sort(nums);

        Set<Integer> h=new TreeSet<>();
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