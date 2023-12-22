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
        ArrayList<Integer> al=new ArrayList<>();
        ListNode temp=head;
        while(temp!=null){
            al.add(temp.val);
            temp=temp.next;

        }
        temp=head;
        int i=al.size()-1;
        while(temp.next!=null){
            if(al.get(i)!=temp.val){
                return false;
            }
            i--;
            if(i==(al.size()/2)-1){
                return true;
            }
            temp=temp.next;
        }
        return true;
    }
}