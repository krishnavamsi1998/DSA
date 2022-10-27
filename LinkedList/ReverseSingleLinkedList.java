//O(n),O(1)

class Solution {
    public ListNode reverseList(ListNode head) {
        
        ListNode prev=null;
        ListNode curr=head;
        
        while(curr!=null)
        {
            ListNode nextOfCurr=curr.next;
            
            curr.next=prev;
            prev=curr;
            curr=nextOfCurr;
            
        }        
        return prev;        
        
    }
}
