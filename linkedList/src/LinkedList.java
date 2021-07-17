public class LinkedList {
    Node head;
    //basic operations
    public void insertElementAtEnd(int data){
        isEmpty();
       Node current = head;
        while (current.next != null){
            current = current.next;
        }
        current.next = new Node(data);
    }

    public void insertElementAtStart(int data){
        Node newHead = new Node(data);
        newHead.next = head;
        head = newHead;
    }

    public void deleteElements(int data){
        if (head == null) return;
        if (head.data == data){
            head = head.next;
            return;
        }

        Node current = head;
        while (current.next.data == data){
            current.next = current.next.next;
            return;
        }
        current = current.next;
    }

    //utilities
    void displayList(){
        Node n = head;
        while (n != null){
            System.out.print(n.data + " ");
            n = n.next;
        }
        System.out.println();
    }

    void dropList(){
        head = null;
        return;
    }

    void isEmpty(){
        if(head == null){
            System.out.println("List currently empty.");
        }else return;
    }
}