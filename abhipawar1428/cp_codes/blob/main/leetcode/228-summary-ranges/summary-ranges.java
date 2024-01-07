class Solution {
    public List<String> summaryRanges(int[] nums) {
        ArrayList<String> retAl=new ArrayList<>();
        int start=0;
        int end=0;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]+1==nums[i+1]){
                end++;
                if(end==nums.length-1){
                    retAl.add(nums[start]+"->"+nums[end]);
                }

            }else{
                if(start==end){
                    retAl.add(Integer.toString(nums[start]));
                    start++;
                    end++;
                }else{
                    retAl.add(nums[start]+"->"+nums[end]);
                    start=++end;
                }
                if(i==nums.length-2){
                    retAl.add(Integer.toString(nums[end]));
                }

            }
        }
        if(nums.length==0){
            return retAl;
        }else if(retAl.isEmpty()){
            retAl.add(Integer.toString(nums[0]));
        }
        return retAl;
    }
}