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
    public ListNode reverseList(ListNode head) {
        ListNode temp1=head;
        ListNode temp2=null;

        while(temp1!=null){
            if(temp2==null){
                ListNode newNode=new ListNode(temp1.val);
                temp2=newNode;
            }else{
                ListNode newNode=new ListNode(temp1.val);
                newNode.next=temp2;
                temp2=newNode;
            }
            temp1=temp1.next;
        }
        return temp2;
    }
}