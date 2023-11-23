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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(head.next==null || left==right){
            return head;
        }
        ListNode temp1=head;
        ListNode temp2=head;
        ListNode temp3=head;

        int count=0;

    
        while(count!=right){
            temp3=temp3.next;
            count++;
        }
        count=1;
        while(left != count){
            temp1=temp2;
            temp2=temp2.next;
            count++;
        }
        ListNode head2=null;
        count=0;
        while(true){
            if(head2==null){
                ListNode newNode=new ListNode(temp2.val);
                head2=newNode;
                newNode.next=temp3;
                temp2=temp2.next;
            }else{
                ListNode newNode=new ListNode(temp2.val);
                newNode.next=head2;
                head2=newNode;
                temp2=temp2.next;
            }
            if(count==right-left){
                break;
            }
            count++;
        }
        if(left==1){
            return head2;
        }
        temp1.next=head2;
        return head;

    }
}