//we create a dummy node and set dummy.next = head. This node helps us keep track of the new head in case the existing head has to be removed.
//O(n),O(1)

class Solution {
    public ListNode removeElements(ListNode head, int val) {
        
        ListNode dummy = new ListNode();
        dummy.next = head;        
        ListNode curr=head;      
        ListNode prev=dummy;       
        
        while(curr!=null)
        {
            
            if(curr.val==val)                
                prev.next=curr.next;           
            else
                prev=curr;
            
            curr=curr.next;         
         
        }        
       
        return dummy.next;
        
    }
}
