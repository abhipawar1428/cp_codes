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
    public ListNode removeNodes(ListNode head) {
        head=rev(head);
        ListNode temp2=head;
        ListNode temp=head;
        int max=temp2.val;
        while(temp.next!=null){
            if(temp.next.val<max){
                temp.next=temp.next.next;
                
            }else{
                max=temp.next.val;
                temp=temp.next;
            }
        }
        return rev(head);

    }
    public ListNode rev(ListNode head){
        
        ListNode temp=head;
        ListNode temp2=null;

        while(temp!=null){
            if(temp2==null){
                ListNode newNode=new ListNode(temp.val);
                temp2=newNode;
                temp=temp.next;
            }else{
                ListNode newNode=new ListNode(temp.val);
                newNode.next=temp2;
                temp2=newNode;
                temp=temp.next;
            }
        }
        return temp2;
    }
}