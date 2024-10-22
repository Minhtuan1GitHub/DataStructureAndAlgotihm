public class Main{

    public static void main(String[] args){
        MyLinkedList<String> nmt = new MyLinkedList<>();
        nmt.addFirst("a");
        nmt.print();

        nmt.addLast("b");
        nmt.print();

        Node<String> node = nmt.findNode("b");
        nmt.addAfter("c", node);
        nmt.print();

        // nmt.removeFirst();
        // nmt.print();
        // nmt.removeFirst();
        // nmt.print();
        // nmt.removeFirst();
        // nmt.removeFirst();
        // nmt.print();

        nmt.removeLast();
        nmt.print();
        nmt.removeLast();
        nmt.print();
        nmt.removeFirst();
        // nmt.print();
        // nmt.removeLast();



        // System.out.println(nmt.findNode("c"));
    }
}