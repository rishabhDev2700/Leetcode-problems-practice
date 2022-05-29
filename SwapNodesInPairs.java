class SwapNodesInPairs {
    public static void main(String[] args) {
        ListNode list = new ListNode(0),p=list;
        int n=5;
        for (int i=1;i<=n;i++){
            p.next = new ListNode(i);
            p=p.next;
        }
        list = swapPairs(list.next);
        while(list!=null){
            System.out.print(list.val+" ");
            list=list.next;
        }
    }
    public static ListNode swapPairs(ListNode head) {
        ListNode current=head,ans=new ListNode(0,head),next,prev;
        prev=ans;
        while(current!=null&&current.next!=null){
            next = current.next;
            prev.next = next;
            current.next = next.next;
            next.next = current;
            prev=current;
            current = current.next;
        }
        return ans.next;
    }
}