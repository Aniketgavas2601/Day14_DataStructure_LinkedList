package com.bridgelabz.linkedlist;

public class LinkedListIterator <A>{
    public void iterateLinkedList(LinkedList<A> linkedList) {

        Node<A> tempNode = linkedList.headNode;

        while(tempNode != null){

            System.out.print(tempNode.getData()+ " ");
            tempNode = tempNode.getNextNode();
        }

    }
}
