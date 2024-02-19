class MyGoodSol {
    public ListNode rotateRight(ListNode head, int k) {
        if (k == 0 || head == null || head.next == null) return head;


        ListNode cur = head;
        int counter = 1;
        while (cur.next != null) {
            counter++;
            cur = cur.next;
        }
        k %= counter;
        if (k == 0) return head;
        cur.next = head;
        
        cur = head;
        for (int i = 0; i < counter - k-1; i++) {
            cur = cur.next;
        }
        head = cur.next;
        cur.next = null;
        return head;
    }
}