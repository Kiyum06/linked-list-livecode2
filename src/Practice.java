public class Practice {
    public static void main(String[] args) {
        Node myNode = new Node('w', null);
        Node otherNode = new Node('x', null);
        Node coolNode = new Node('e', null);
        Node helloNode = new Node('f', null);
        myNode.next = otherNode;
        otherNode.next = coolNode;
        coolNode.next = helloNode;

        //  int numNodes = length(myNodes);
        // int numNodes = myNode.length();
        // System.out.print(numNodes);

        Node newHead = removeAt(myNode, 0);

        Node current = myNode;

        while(current != null) {
            System.out.println(current.value);
            current = current.next;
        }

        //System.out.println(myNode.value);
        //System.out.println(otherNode.value); //System.out.println(myNode.next.value);
        //System.out.println(coolNode.value); //System.out.println(myNode.next.next.value);
    }

    // count how many nodes are in the linked list 
    public static int length(Node head) {
        int count = 0; 

        Node current = head;

        while(current != null) {
            count++;
            current = current.next;
        }

        return count;
    }

    // remove the node at removeIdx
    // head is at index
    // example w->x->e->f
    // removeIdx 2
    // result w->x->f
    // Return the new head if the list
    public static Node removeAt(Node head, int removeIdx) {
        if(removeIdx < 0) {
            throw new IllegalArgumentException("removeIdx must be >= 0");

        }
        if(removeIdx == 0) {
            return head.next;
        }

        Node current = head;

        for(int i = 0; i < removeIdx -1; i++) {
            if(current == null) {
                throw new IndexOutOfBoundsException("removeIdx must be < len(list)");
            }
            current = current.next;
        }

        current.next = current.next.next;

        return head;
    }


}
