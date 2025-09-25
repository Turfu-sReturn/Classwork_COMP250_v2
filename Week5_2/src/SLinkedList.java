public class SLinkedList {
    private SNode head;
    private SNode tail;
    private int size;

    private class SNode {
        String element;
        SNode next;
    }

    public void addFirst(String e) {
        SNode newNode = new SNode();
        newNode.element = e;
        newNode.next = head;
        // edge case
        if (head == null)
            tail = newNode;
        head = newNode;
        size += 1;
    }

    public void addLast(String e) {
        // Create a new node
        SNode newNode = new SNode();
        newNode.element = e;

        // Add it to the end
        tail.next = newNode;
        tail = newNode;
        size += 1;
    }

    public String removeLast() {
        // Edge cases
        if (size == 0)
            throw new IllegalArgumentException("The list is empty.");
        if (size == 1) {
            SNode temp = tail;
            tail = null;
            head = null;
            size -= 1;
            return temp.element;
        }

        // get the reference needed to update the tail
        SNode tmp = head;
        while (tmp.next != tail)
            tmp = tmp.next;

        // update the fields
        tail = tmp;
        String return_element = tmp.next.element;
        tail.next = null;
        size -= 1;

        // return the element removed
        return return_element;
    }
}
