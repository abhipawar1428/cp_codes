class Solution {
    public List<Integer> intersection(int[][] nums) {
        TreeMap<Integer,Integer> tmap=new TreeMap<>();
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums[i].length;j++){
                tmap.put(nums[i][j],tmap.getOrDefault(nums[i][j],0)+1);
            }
        }
        ArrayList<Integer> al=new ArrayList<>();
        int c=nums.length;
        for(int key:tmap.keySet()){
            if(tmap.get(key)==c){
                al.add(key);
            }
        }
        return al;
    }
}