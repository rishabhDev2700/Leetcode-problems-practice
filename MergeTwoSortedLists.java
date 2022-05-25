public class MergeTwoSortedLists {
    public static void main(String[] args) {

    }

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode merge = new ListNode();
        ListNode pointer = merge, l1 = list1, l2 = list2;
        while (l1 != null&&l2 != null) {
            if (l1.val <= l2.val) {
                pointer.next = new ListNode(l1.val);
                pointer = pointer.next;
                l1 = l1.next;
            } else {
                pointer.next = new ListNode(l2.val);
                pointer = pointer.next;
                l2 = l2.next;
            }
        }
        if(l1==null){
            while(l2!=null){
                pointer.next = new ListNode(l2.val);
                pointer = pointer.next;
                l2 = l2.next;
            }
        }else {
            while(l1!=null){
                pointer.next = new ListNode(l1.val);
                pointer = pointer.next;
                l1 = l1.next;
            }
        }
        return merge.next;
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}