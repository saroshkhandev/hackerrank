public class MergeLinkedLists {
    public static LinkedListNode<Integer> mergeTwoSortedLinkedLists(LinkedListNode<Integer> head1, LinkedListNode<Integer> head2) {
        //Your code goes here
        if (head1 == null)
            return head2;
        if (head2 == null)
            return head1;


        LinkedListNode<Integer> t1 = head1;
        LinkedListNode<Integer> t2 = head2;
        LinkedListNode<Integer> head = null;
        LinkedListNode<Integer> tail = null;

        if (t1.data <= t2.data) {
            head = t1;
            tail = t1;
            t1 = t1.next;
        } else {
            head = t2;
            tail = t2;
            t2 = t2.next;
        }

        while (t1 != null && t2 != null) {
            if (t1.data > t2.data) {
                tail.next = t2;
                t2 = t2.next;
                tail = tail.next;
                // t1=t1.next;

            } else {
                tail.next = t1;
                tail = t1;
                t1 = t1.next;
            }
        }
        if (t1 != null) {
            tail.next = t1;
        } else {
            tail.next = t2;
        }
        return head;
    }
}