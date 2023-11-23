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
        int i=0;
        Collections.reverse(al);
        while(temp!=null){
            if(temp.val != al.get(i)){
                return false;
            }
            i++;
            temp=temp.next;
        }
        return true;
    }
}