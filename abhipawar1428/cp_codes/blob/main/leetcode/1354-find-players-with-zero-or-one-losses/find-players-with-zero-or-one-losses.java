class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
        TreeMap<Integer,Integer> Map=new TreeMap<>();
        for(int i=0;i<matches.length;i++){
            Map.put(matches[i][1],Map.getOrDefault(matches[i][1],0)+1);
        }
        ArrayList<Integer> losers=new ArrayList<>();
        for(int key:Map.keySet()){
            if(Map.get(key)==1){
                losers.add(key);
            }
        }
        TreeSet<Integer> tSet=new TreeSet<>();
        ArrayList<Integer> winners=new ArrayList<>();
        for(int i=0;i<matches.length;i++){
            if(!Map.containsKey(matches[i][0])){
                tSet.add(matches[i][0]);
            }
        }
        for(int key:tSet){
            winners.add(key);
        }
        //Collections.sort(w);
        List<List<Integer>> ret=new ArrayList<>();
        ret.add(winners);
        ret.add(losers);
        return ret;

    }
}