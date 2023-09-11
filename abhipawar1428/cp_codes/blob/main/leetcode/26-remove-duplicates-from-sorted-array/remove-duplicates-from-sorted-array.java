class Solution {
    public int removeDuplicates(int[] nums) {
        
        ArrayList<Integer> ret=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(!ret.contains(nums[i])){
                ret.add(nums[i]);
            }
        }
        for(int i=0;i<ret.size();i++){
            nums[i]=ret.get(i);
        }
        return ret.size();
        
   
    }
}