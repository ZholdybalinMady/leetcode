public class Task2 {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(9);
        l1.next = new ListNode(9);
        l1.next.next = new ListNode(9);
        l1.next.next.next = new ListNode(9);
        l1.next.next.next.next = new ListNode(9);
        l1.next.next.next.next.next = new ListNode(9);
        l1.next.next.next.next.next.next = new ListNode(9);

        ListNode l2 = new ListNode(9);
        l2.next = new ListNode(9);
        l2.next.next = new ListNode(9);
        l2.next.next.next = new ListNode(9);

        ListNode result = addTwoNumbers(l1, l2);
        while (result != null) {
            System.out.println(result.val);
            result = result.next;
        }

    }


    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode listNode = null;
        ListNode current = null;
        int carry = 0;

        while ((l1 != null && l1.val >= 0) || (l2 != null && l2.val >= 0) || carry > 0) {
            int val1 = l1 == null ? 0 : l1.val;
            int val2 = l2 == null ? 0 : l2.val;
            int sum = val1 + val2 + carry;
            carry = 0;
            if (sum / 10 > 0) carry = sum / 10;
            l1 = l1 == null ? null : l1.next;
            l2 = l2 == null ? null : l2.next;

            if (listNode == null) {
                listNode = new ListNode((carry > 0 ? sum % 10 : sum), null);
                current = listNode;
            } else {
                current.next = new ListNode((carry > 0 ? sum % 10 : sum), null);
                current = current.next;
            }


        }
        return listNode;
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
