class Solution {
    public List<Integer> majorityElement(int[] nums) {
        ArrayList<Integer> al=new ArrayList<>();
        HashMap<Integer,Integer> hm=new HashMap<>();

        for(int i=0;i<nums.length;i++){
            hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
        }
        int x=nums.length/3;
        for(int key:hm.keySet()){
            if(hm.get(key)>x){
                al.add(key);
            }
        }
        return al;
    }
}