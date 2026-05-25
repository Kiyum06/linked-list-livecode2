public class Node {
    public char value;
    public Node next;

    public Node(char value, Node next) {
        this.value = value;
        this.next = next;
    }

    public int length() {
        int count = 0; 

        Node current = this;

        while(current != null) {
            count++;
            current = current.next;
        }

        return count;
    }
}