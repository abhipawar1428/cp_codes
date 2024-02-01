class Solution {
    public String addBinary(String a, String b) {
        int carry=0;
        int ptr1=a.length()-1;
        int ptr2=b.length()-1;

        StringBuilder sb=new StringBuilder();
        while(ptr1!=-1 && ptr2!=-1){
            if((a.charAt(ptr1)-'0')+ (b.charAt(ptr2)-'0') + carry==2){
                carry=1;
                sb.append(0);
            }else if((a.charAt(ptr1)-'0')+ (b.charAt(ptr2)-'0') + carry==3){
                carry=1;
                sb.append(1);
            }else if((a.charAt(ptr1)-'0')+ (b.charAt(ptr2)-'0') + carry==1){
                carry=0;
                sb.append(1);
            }else{
                carry=0;
                sb.append(0);
            }
            ptr1--;
            ptr2--;
        }
        while(ptr1!=-1){
            if((a.charAt(ptr1)-'0')+carry ==2){
                carry=1;
                sb.append(0);
            }else if((a.charAt(ptr1)-'0')+carry ==1){
                carry=0;
                sb.append(1);
            }else{
                carry=0;
                sb.append(0);
            }
            ptr1--;
        }
        while(ptr2!=-1){
            if((b.charAt(ptr2)-'0')+carry ==2){
                carry=1;
                sb.append(0);
            }else if((b.charAt(ptr2)-'0')+carry ==1){
                carry=0;
                sb.append(1);
            }else{
                carry=0;
                sb.append(0);
            }
            ptr2--;
        }
        if(carry==1){
            sb.append(1);
        }
        return sb.reverse().toString();

    }
}