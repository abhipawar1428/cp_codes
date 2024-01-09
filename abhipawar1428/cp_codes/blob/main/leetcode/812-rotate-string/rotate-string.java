class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length()!=goal.length()){
            return false;
        }else{
            goal=goal.concat(goal);
            if(goal.indexOf(s)!=-1){
                return true;
            }else
                return false;
        }

    }
}