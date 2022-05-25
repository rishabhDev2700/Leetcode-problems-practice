public class AddTwoNumbers {
     public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = null, p3 = null, p1 = l1, p2 = l2;
        int carry = 0, sum;
        while (p1 != null || p2 != null || carry == 1) {
            sum = 0;
            if (p1 != null) {
                sum += p1.val;
                p1 = p1.next;
            }
            if (p2 != null) {
                sum += p2.val;
                p2 = p2.next;
            }
            sum += carry;
            carry = sum / 10;
            if (head == null) {
                head = new ListNode(sum % 10);
                p3 = head;
            } else {
                p3.next = new ListNode();
                p3 = p3.next;
            }
        }
        return head;
    }
}
