package com.bridgelabz.linkedlist;

public class Main {
    public static void main(String[] args) {

        Node<Integer> firstNode = new Node<>(56);
        Node<Integer> secondNode = new Node<>(30);
        Node<Integer> thirdNode = new Node<>(70);


        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(firstNode);
        linkedList.add(secondNode);
        linkedList.add(thirdNode);

        LinkedListIterator<Integer> linkedListIterator = new LinkedListIterator<>();
        linkedListIterator.iterateLinkedList(linkedList);

    }
}
