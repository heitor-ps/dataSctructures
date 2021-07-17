public class Main {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.insertElementAtStart(12);
        ll.insertElementAtStart(14);
        ll.insertElementAtStart(13);
        ll.insertElementAtStart(15);
        ll.insertElementAtStart(234);
        ll.insertElementAtEnd(2354);
        System.out.println("Now showing the list...");
        ll.displayList();
        ll.deleteElements(234);
        System.out.println();
        ll.displayList();
        ll.dropList();
        ll.displayList();
        ll.isEmpty();
        ll.insertElementAtStart(12);
        ll.displayList();

    }
}
