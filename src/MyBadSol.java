class MyBadSol {
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
        for (int i = 0; i < k; i++) {
            cur = cur.next;
        }

        if (k == counter-1) {
            cur = head;
            head = head.next;
            cur.next = null;
        } else {
            head = cur.next;
            cur.next = null;
        }

        return head;
    }
}