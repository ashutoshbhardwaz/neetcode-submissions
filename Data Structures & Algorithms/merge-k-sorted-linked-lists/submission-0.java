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
    public ListNode mergeKLists(ListNode[] lists) {
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<lists.length;i++){
            ListNode l=lists[i];
            while(l!=null){
                list.add(l.val);
                l=l.next;
            }
        }
        Collections.sort(list);
        ListNode head= new ListNode(0);
        ListNode curr=head;
        for(int i=0;i<list.size();i++){
            curr.next=new ListNode(list.get(i));
            curr=curr.next;
        }
        return head.next;
    }
}
