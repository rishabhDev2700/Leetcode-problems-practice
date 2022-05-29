public class MiddleOfTheLinkedList {
    public static ListNode middleNode(ListNode head) {
        if(head==null||head.next==null) return head;
        ListNode pointer=head.next;
        int count=1;
        while(pointer!=null){
            count++;
            pointer=pointer.next;
        }
        pointer=head;
        count/=2;
        while(pointer!=null){
            count--;
            pointer=pointer.next;
            if(count<=0){
                break;
            }
        }
        return pointer;
    }
}
