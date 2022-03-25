package org.example.linkedList;

public class SingleDriver {

    public static void main(String[] args) {

        LinkedList<String> LinkedList = new SinglyLinkedList<>();

        LinkedList.addFirst("first");
        LinkedList.addFirst("second");
        LinkedList.addFirst("third");
        LinkedList.addFirst("fourth");
        LinkedList.addFirst("fifth");

        LinkedList.addLast("sixth");
        LinkedList.addLast("seventh");
        LinkedList.addLast("eighth");

        System.out.println(LinkedList);

        System.out.println(LinkedList.pollFirst());

        System.out.println(LinkedList);

        System.out.println(LinkedList.pollLast());

        System.out.println(LinkedList);

        LinkedList.clear();

        System.out.println(LinkedList);
    }
}