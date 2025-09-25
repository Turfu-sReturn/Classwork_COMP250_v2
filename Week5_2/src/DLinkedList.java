public class DLinkedList {
    private DNode head;
    private DNode tail;
    private int size;

    private class DNode {
        String element;
        DNode next;
        DNode prev;
    }

    public String removeLast() {
        tail = tail.prev;
        tail.next.prev = null;  // Not necessary
        String return_e = tail.next.element;
        tail.next = null;
        size -= 1;
        return return_e;

        // Edge cases for size = 0 and 1 to be added
    }
}
