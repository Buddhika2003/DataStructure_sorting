class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

public class QuickSortLinkedList {

    
    private Node getTail(Node cur) {
        while (cur != null && cur.next != null) {
            cur = cur.next;
        }
        return cur;
    }

   
    private Node[] partition(Node head, Node end) {
        Node pivot = end;
        Node prev = null, cur = head, tail = pivot;

        Node newHead = null, newEnd = pivot;

        while (cur != pivot) {
            if (cur.data < pivot.data) {
                if (newHead == null) {
                    newHead = cur;
                }
                prev = cur;
                cur = cur.next;
            } else {
                if (prev != null) {
                    prev.next = cur.next;
                }
                Node temp = cur.next;
                cur.next = null;
                tail.next = cur;
                tail = cur;
                cur = temp;
            }
        }

        if (newHead == null) {
            newHead = pivot;
        }

        newEnd = tail;
        return new Node[]{newHead, pivot, newEnd};
    }

    
    private Node quickSortRecur(Node head, Node end) {
        if (head == null || head == end) {
            return head;
        }

        Node[] partitionResult = partition(head, end);
        Node newHead = partitionResult[0];
        Node pivot = partitionResult[1];
        Node newEnd = partitionResult[2];

        
        if (newHead != pivot) {
            Node temp = newHead;
            while (temp.next != pivot) {
                temp = temp.next;
            }
            temp.next = null;

            newHead = quickSortRecur(newHead, temp);

            temp = getTail(newHead);
            temp.next = pivot;
        }

        
        pivot.next = quickSortRecur(pivot.next, newEnd);

        return newHead;
    }

    public Node quickSort(Node head) {
        Node end = getTail(head);
        return quickSortRecur(head, end);
    }

    
    public void printList(Node head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println();
    }

   
    public static void main(String[] args) {
        QuickSortLinkedList list = new QuickSortLinkedList();
        Node head = new Node(30);
        head.next = new Node(3);
        head.next.next = new Node(4);
        head.next.next.next = new Node(20);
        head.next.next.next.next = new Node(5);

        System.out.println("Original List:");
        list.printList(head);

        head = list.quickSort(head);

        System.out.println("Sorted List:");
        list.printList(head);
    }
}
