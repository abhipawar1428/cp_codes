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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1==null && list2==null){
            return list1;
        }else if(list1==null){
            return list2;
        }else if(list2==null){
            return list1;
        }
        
        ListNode temp1=list1;
        ListNode temp2=list2;

        ListNode list3=null;
        ListNode temp3=null;
        while(temp1!=null && temp2!=null){
            if(temp1.val<temp2.val){
                if(list3==null){
                    ListNode newNode=new ListNode(temp1.val);
                    list3=newNode;
                    temp3=list3;
                }else{
                    ListNode newNode=new ListNode(temp1.val);
                    temp3.next=newNode;
                    temp3=temp3.next;
                }
                temp1=temp1.next;
            }else{
                if(list3==null){
                    ListNode newNode=new ListNode(temp2.val);
                    list3=newNode;
                    temp3=list3;
                }else{
                    ListNode newNode=new ListNode(temp2.val);
                    temp3.next=newNode;
                    temp3=temp3.next;
                }
                temp2=temp2.next;
            }
        }
        while(temp1!=null){
            ListNode newNode=new ListNode(temp1.val);
            temp3.next=newNode;
            temp3=temp3.next;
            temp1=temp1.next;
        }
        while(temp2!=null){
            ListNode newNode=new ListNode(temp2.val);
            temp3.next=newNode;
            temp3=temp3.next;
            temp2=temp2.next;
        }
        return list3;
    }
}