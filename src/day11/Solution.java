package day11;

class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}
public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode s1 = head;
        ListNode fa = head;
        while (fa != null && fa.next != null) {
            s1 = s1.next;
            fa = fa.next.next;
            if (s1 == fa) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Solution ob = new Solution();
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(2);
        n1.next = n2;
        n2.next = n1; 
        System.out.println(ob.hasCycle(n1)); 
    }
}