class Solution {
    //97->a
    public int getLucky(String s, int k) {
        int num=0;
        StringBuffer sb=new StringBuffer();
        for(int i=0;i<s.length();i++){
            sb.append((int)s.charAt(i)-96);
        }
        System.out.println(sb.length());

        if(k>=1){
            for(int i=0;i<sb.length();i++){
                num=num+Character.getNumericValue(sb.charAt(i));
            }
            k--;
        }
        System.out.println(num);
        while(k!=0){
            k--;
            int temp=num;
            num=0;
            while(temp!=0){
                num=num+temp%10;
                temp=temp/10;

            }
        }
        return num;
    }
}