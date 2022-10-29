package com.bridgelabz.linkedlist;

public class Main {
    public static void main(String[] args) {

        System.out.println("************Linked List**********");
        Node<Integer> firstNode = new Node<>(56);
        Node<Integer> secondNode = new Node<>(30);
        Node<Integer> thirdNode = new Node<>(70);


        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(firstNode);
        linkedList.add(secondNode);
        linkedList.add(thirdNode);


        //UC5 delete first element 56

        //linkedList.pop(56);

        //UC6 delete last element 70

        //linkedList.pop(70);

        linkedList.pop(30);

        //UC4 Ability to insert 30 between 56 and 70

        Node<Integer> newNodeToBeInserted = new Node<>(30);
        linkedList.insert(newNodeToBeInserted,1);

        LinkedListIterator<Integer> linkedListIterator = new LinkedListIterator<>();
        linkedListIterator.iterateLinkedList(linkedList);
        
    }

}
