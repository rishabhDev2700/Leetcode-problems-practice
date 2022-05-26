public class RemoveNthNodeFromTheEndOfList {
    public static void main(String[] args) {
        ListNode list = new ListNode(),head;
        head=list;
        for(int i=1;i<=1;i++){
            list.next = new ListNode(i);
            list=list.next;
        }
        head=head.next;
        list=head;
        while(list!=null){
            System.out.print(list.val+" ");
            list=list.next;
        }
        System.out.println();
        ListNode solution = removeNthFromEnd(head,1);
        while(solution!=null){
            System.out.print(solution.val+" ");
            solution=solution.next;
        }
    }
    public static ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode l = head;
        int count=0;
        while(l!=null){
            count++;
            l=l.next;
        }
        if(n==count)return head.next;
        count=count-(n+1);
        l=head;
        while(l.next!=null){
            if(count==0){
                l.next=l.next.next;
            }else{
                l=l.next;
            }
            count--;
        }
        return head;
    }
}
