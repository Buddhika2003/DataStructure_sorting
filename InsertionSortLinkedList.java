class ListNode {
    int val;
    ListNode next;
    ListNode(int val) {
        this.val = val;
    }
}

class InsertionSortLinkedList {
    public static ListNode insertionSortList(ListNode head) {
        ListNode dummy = new ListNode(0);
        ListNode curr = head;

        while (curr != null) {
            ListNode prev = dummy;
            while (prev.next != null && prev.next.val < curr.val) {
                prev = prev.next;
            }

            ListNode nextTemp = curr.next;
            curr.next = prev.next;
            prev.next = curr;
            curr = nextTemp;
        }

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

        ListNode sorted = insertionSortList(head);
        System.out.println("Sorted List (Insertion Sort):");
        printList(sorted);
    }
}
