package datastructure.chap02.linkedlist.singly;

public class Test {

    public static void main(String[] args) {

        SimpleLinkedList<String> list = new SimpleLinkedList<>();

        list.addFirst("오징어");
        list.addFirst("문어");
        list.addFirst("쭈꾸미");

        String s = list.printList();
        System.out.println(s);

        SimpleLinkedList<Double> dList = new SimpleLinkedList<>(); // 대문자래퍼클래스로써야함 기본타입못씀

        dList.addFirst(3.5);
        dList.addFirst(5.5);
        dList.addFirst(7.5);
        System.out.println(dList.printList());

    }
}
