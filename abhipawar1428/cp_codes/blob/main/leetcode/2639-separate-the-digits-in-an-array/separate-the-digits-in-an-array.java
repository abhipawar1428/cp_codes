class Solution {
    public int[] separateDigits(int[] nums) {
        ArrayList<Integer> al=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            String str=Integer.toString(nums[i]);
            for(int j=0;j<str.length();j++){
                al.add((int)str.charAt(j)-'0');
            }
        }
        int[] ret=new int[al.size()];
        for(int i=0;i<al.size();i++){
            ret[i]=(int)al.get(i);
        }
        return ret;
    }
}