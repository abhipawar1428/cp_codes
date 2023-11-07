class Solution {
    public int[] singleNumber(int[] nums) {
        HashMap<Integer,Integer> hmap=new HashMap<>();
        int i=0;
        while(true){
            hmap.put(nums[i],hmap.getOrDefault(nums[i],0)+1);
            i++;
            if(i==nums.length){
                break;
            }
        }
        i=0;
        int[] ret=new int[2];
        for(int key:hmap.keySet()){
            if(hmap.get(key)==1){
                ret[i]=key;
                i++;
                if(i==2){
                    break;
                }
            }
        }
        return ret;
    }
}