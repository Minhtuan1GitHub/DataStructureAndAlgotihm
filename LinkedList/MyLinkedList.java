import java.util.*;

public class MyLinkedList<E> implements ListLinkedList<E>{
    private Node<E> head;
    private int numNode;

    public MyLinkedList(){}


    public void addFirst(E data){
        this.head = new Node<E> (data, this.head);
        this.numNode++;
    }

    public void addLast(E data){
        if (this.head == null){
            addFirst(data);
        }else{
            Node<E> temp = this.head;
            while (temp.getNext() != null){
                temp = temp.getNext();
            }
            Node<E> newNode = new Node<E>(data,null);
            temp.setNext(newNode);
            this.numNode++;
        }
    }

    public void addAfter(E data, Node<E> key) throws NoSuchElementException{
        if (key == null) {
            throw new NoSuchElementException("Not having node like that !");
        }else{
            Node<E> newNode = new Node<E> (data, key.getNext());
            key.setNext(newNode);
            this.numNode++;
        }
    }

    public Node<E> removeFirst() throws NoSuchElementException{
        if (this.head == null){
            throw new NoSuchElementException("nothing to remove");
        }else{
            Node<E> temp = this.head;
            if (temp.getNext() == null){
                this.head = null;
                this.numNode--;
                return temp;
            }   
            this.head = temp.getNext();
            this.numNode--;
            return temp;
        }
    }

    public Node<E> removeLast() throws NoSuchElementException{
        if (this.head == null){
            throw new NoSuchElementException("nothing to remove");
        }else{
            Node<E> temp = this.head;
            if (temp.getNext() == null){
                this.head = null;
                this.numNode--;
                return temp;
            }
            Node<E> pre = null;
            while (temp.getNext() != null){
                pre = temp;
                temp = temp.getNext();
            }
            pre.setNext(null);
            this.numNode--;
            return temp;
        }
    }


    public Node<E> findNode(E data){
        if (this.head == null) {return null;}
        Node<E> temp = this.head;
        while (temp != null && temp.getData() != data){
            temp = temp.getNext();
        }
        if (temp == null){
            return null;
        }
        return temp;
    }


    public void print() throws NoSuchElementException{
        if (this.head == null){
            throw new NoSuchElementException("nothing to print");
        }else{
            Node<E> temp = this.head;
            while (temp!=null){
                System.out.print(temp.getData()+"->");
                temp = temp.getNext();
            }
            System.out.print("null");
        }
        System.out.println();
    }

}