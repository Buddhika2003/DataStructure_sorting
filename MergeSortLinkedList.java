class ListNode {
    int val;
    ListNode next;
    ListNode(int val) {
        this.val = val;
    }
}

public class MergeSortLinkedList {
    public static ListNode mergeSortList(ListNode head) {
        if (head == null || head.next == null) return head;

        ListNode mid = getMiddle(head);
        ListNode right = mid.next;
        mid.next = null;

        ListNode left = mergeSortList(head);
        right = mergeSortList(right);

        return merge(left, right);
    }

    private static ListNode getMiddle(ListNode head) {
        ListNode slow = head, fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    private static ListNode merge(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;

        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                tail.next = l1;
                l1 = l1.next;
            } else {
                tail.next = l2;
                l2 = l2.next;
            }
            tail = tail.next;
        }

        tail.next = (l1 != null) ? l1 : l2;
        return dummy.next;
    }

    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
        System.out.println();
    }

    public static ListNode createList(int[] arr) {
        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;
        for (int val : arr) {
            tail.next = new ListNode(val);
            tail = tail.next;
        }
        return dummy.next;
    }

    public static void main(String[] args) {
        int[] values = {4, 2, 1, 3};
        ListNode head = createList(values);
        System.out.println("Original List:");
        printList(head);

        ListNode sorted = mergeSortList(head);
        System.out.println("Sorted List (Merge Sort):");
        printList(sorted);
    }
}
