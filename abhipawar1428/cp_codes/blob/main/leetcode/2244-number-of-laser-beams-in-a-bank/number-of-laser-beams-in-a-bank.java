class Solution {
    public int numberOfBeams(String[] bank) {
        ArrayList<Integer> al=new ArrayList<>();
        for(int i=0;i<bank.length;i++){
            int count=0;
            for(int j=0;j<bank[i].length();j++){
                if(bank[i].charAt(j)=='1'){
                    count++;
                }
            }
            if(count!=0)
                al.add(count);
        }
        if(al.size()<2){
            return 0;
        }
        int ret=0;
        for(int i=0;i<al.size()-1;i++){
            ret=ret+(al.get(i)*al.get(i+1));
        }
        return ret;
    }
}