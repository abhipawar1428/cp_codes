/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
        if(head.next==null){
            return true;
        }
        ArrayList<Integer> al=new ArrayList<>();
        ListNode temp=head;

        while(temp!=null){
            al.add(temp.val);
            temp=temp.next;
        }
        temp=head;
        int i=al.size()-1;
        int size=al.size();
        while(true){
            if(temp.val != al.get(i)){
                return false;
            }
            i--;
            if(i==(size/2)-1){
                break;
            }
            temp=temp.next;
        }
        return true;
    }
}