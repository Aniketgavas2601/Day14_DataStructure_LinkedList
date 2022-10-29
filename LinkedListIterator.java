package com.bridgelabz.linkedlist;

public class LinkedListIterator <A> {
    public void iterateLinkedList(LinkedList<A> linkedList) {
        Node<A> tempNode = linkedList.headNode;
        int count = 0;
        while (tempNode != null) {

            System.out.print(tempNode.getData() + " -> ");
            tempNode = tempNode.getNextNode();
            count++;
        }
        System.out.println();
        System.out.println("The size of LinkedList is " + count);
    }
}

