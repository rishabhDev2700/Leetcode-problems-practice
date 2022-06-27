public class RotateList {
    public static void main(String[] args) {
        ListNode list = new ListNode(1), pointer = list;
        int i = 1;
        while (i < 5) {
            pointer.next = new ListNode(i+1);
            pointer = pointer.next;
            i++;
        }
        pointer = list;
        while (pointer != null) {
            System.out.print(pointer.val + " ");
            pointer = pointer.next;
        }
        System.out.println();
        RotateList rotate = new RotateList();
        list = rotate.rotateRight(list, 10);
        System.out.println("______Rotate Right_______");
        while (list != null) {
            System.out.print(list.val + " ");
            list = list.next;
        }
    }

    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null||k==0) return head;
        ListNode pointer = head;
        int count = 1;
        while (pointer.next != null) {
            pointer = pointer.next;
            count++;
        }
        if(count==k)return head;
        k = (k % count == 0) ? 0 : count - (k % count);
        if(k==0) return head;
        pointer.next = head;
        pointer = pointer.next;

        System.out.println("Count:"+count);
        System.out.println("shifts:"+k);
        count = 1;
        while (count < k) {
            pointer = pointer.next;
            count++;
        }
        head = pointer.next;
        pointer.next = null;
        return head;
    }
}
