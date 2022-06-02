package datastructure.chap02.linkedlist.doubly;

public class Main {

    public static void main(String[] args) {

        DoublyLinkedList list = new DoublyLinkedList();

        list.add(3);
        list.add(5);
        list.add(7);
        list.add(9);
        System.out.println(list.printList());

        list.remove(5);
        System.out.println(list.printList());
    }
}
