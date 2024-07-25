class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || k == 0 || head.next == null) return head;

        ListNode root = new ListNode(0, head);
        int n = 1;
        while (head.next != null) {
            head = head.next;
            n++;
        }
        k = k % n;
        head.next = root.next;

        head = root.next;
        for (int i = 0; i < n - k - 1; i++) {
            head = head.next;
        }
        root.next = head.next;
        head.next = null;
        return root.next;
    }
}